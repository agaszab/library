package pl.vxm.netino.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.vxm.netino.books.mod.Book;
import pl.vxm.netino.books.mod.Borrowed;
import pl.vxm.netino.books.mod.Person;
import pl.vxm.netino.books.repository.BookRepository;
import pl.vxm.netino.books.repository.BorrowedRepository;
import pl.vxm.netino.books.repository.PersonRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {


    private BookRepository bookRepository;
    private PersonRepository personRepository;
    private BorrowedRepository borrowedRepository;

    public MainController(BookRepository bookRepository, PersonRepository personRepository, BorrowedRepository borrowedRepository) {
        this.bookRepository = bookRepository;
        this.personRepository = personRepository;
        this.borrowedRepository = borrowedRepository;
    }

    @GetMapping("/persons")
    public String persons(Model model) {
        List<Person> persons = personRepository.findAll();
        model.addAttribute("persons", persons);
        model.addAttribute("hist", true);
        return "persons";
    }

    @GetMapping("/person")
    public String persons(Model model, boolean hist, @RequestParam long idp) {

        Optional<Person> personOptional = personRepository.findById(idp);

        if (personOptional.isPresent()) {
            Person person = personOptional.get();
            model.addAttribute("person", person);
        } else {
            return "redirect:/";
        }

        List<Book> books;
        books=showBooksForPerson(idp, hist);
        model.addAttribute("hist", hist);
        model.addAttribute("books", books);
        if (books.size()>0 && hist==true) model.addAttribute("bookHead", "Aktualnie wypożyczone książki:");
        else if (books.size()==0 && hist==true) model.addAttribute("bookHead", "Obecnie brak wypożyczeń");
        else if (books.size()>0 && hist==false) model.addAttribute("bookHead", "Historia wypożyczeń:");
        else model.addAttribute("bookHead", "Ta osoba nigdy nic wcześniej nie wypożyczała.");
        return "person";
    }

    @GetMapping("/addperson")
    public String addperson(Model model) {
        model.addAttribute("newPerson", new Person());
        return "/addperson";
    }

    @PostMapping("/addp")
    public String addb(Person person) {
        if (!person.getFirstName().equals("") && !person.getLastName().equals("")) {
            personRepository.save(person);
            return "redirect:/persons";
        } else return "/nodata";
    }

    @GetMapping("/books")
    public String books(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "books";
    }


    @GetMapping("/book")
    public String book(Model model, @RequestParam long idb) {

        Optional<Book> bookOptional = bookRepository.findById(idb);
        Borrowed borrowed = borrowedRepository.findByIdbAndReturnedFalse(idb);

        if (bookOptional.isPresent()) {
            if (borrowed!=null) {
                model.addAttribute("pom", true);
                Optional<Person> personOptional = personRepository.findById(borrowed.getIdp());
                if (bookOptional.isPresent()) {
                    Person person = personOptional.get();
                    model.addAttribute("person", person);
                    model.addAttribute("borrowed", borrowed);
                }
            }
             else {
            List<Person> persons = personRepository.findAll();
            model.addAttribute("persons", persons);
            model.addAttribute("pom", false);
        }

                Book book = bookOptional.get();
                model.addAttribute("newBorrowed", new Borrowed());
                model.addAttribute("book", book);

            } else {
                return "redirect:/";
            }

        return "/book";
    }

    @GetMapping("/addbook")
    public String addbook(Model model) {
        model.addAttribute("newBook", new Book());
        return "/addbook";
    }

    @PostMapping("/addb")
    public String addb(Book book) {
        if (!book.getAuthor().equals("") && !book.getTitle().equals("")) {
            bookRepository.save(book);
            return "redirect:/books";
        } else return "/nodata";
    }

    @PostMapping("/addborrowed")
    public String newBorrowed(Borrowed borrowed, Person person) {

            borrowed.setIdb(borrowed.getIdb());
            borrowed.setIdp(person.getIdp());
            borrowed.setReturned(false);
            LocalDate today = LocalDate.now();
            Date sqlDate = Date.valueOf( today );
            borrowed.setDateBorrowing(sqlDate);
            borrowedRepository.save(borrowed);

        return "/books";
    }


    @GetMapping("/returnbook")
    public String returnBook (@RequestParam long id){

        Optional <Borrowed>  borrowedOptional = borrowedRepository.findById(id);
        if (borrowedOptional.isPresent()) {
        Borrowed borrowed=borrowedOptional.get();
        borrowed.setReturned(true);
        borrowedRepository.save(borrowed);
        }

        return "redirect:/";
    }

    @GetMapping("/returnbooks")
    public String returnBookRofPerson (@RequestParam long idb){

        Borrowed  borrowed = borrowedRepository.findByIdbAndReturnedFalse(idb);
        if (borrowed!=null) {
            borrowed.setReturned(true);
            borrowedRepository.save(borrowed);
        }

        return "redirect:/";
    }


    public List<Book> showBooksForPerson(long idp, boolean hist){
        List<Book> books= new ArrayList<>();
        List<Borrowed> borroweds;
        if (hist) borroweds = borrowedRepository.findAllByIdpAndReturnedFalse(idp);
          else borroweds=borrowedRepository.findAllByIdpAndReturnedTrue(idp);
        for (Borrowed elem:borroweds){
            Optional<Book> bookOptional = bookRepository.findById(elem.getIdb());
            if (bookOptional.isPresent()) {
                Book book = bookOptional.get();
                books.add(book);
            }}
     return books;
    }

}