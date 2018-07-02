package pl.vxm.netino.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.vxm.netino.books.mod.Book;
import pl.vxm.netino.books.repository.BookRepository;

import java.util.List;

@Controller
public class MainController {


    private BookRepository bookRepository;

    public MainController (BookRepository bookRepository) {
    this.bookRepository = bookRepository;
   }

    @GetMapping("/books")
    public String books(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/addbook")
    public String addbooks(Model model) {
        model.addAttribute("newBooks", new Book());

        return "/books";
    }
}