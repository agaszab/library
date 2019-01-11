package pl.vxm.netino.books.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.vxm.netino.books.mod.Book;
import pl.vxm.netino.books.mod.Category;

import java.util.List;

public interface BookRepository extends JpaRepository <Book, Long> {

    Page<Book> findAll(Pageable page);
    List <Book> findAllByCategory(Category category);
    List <Book> findAllByAuthor( String author);
    List <Book> findAllByTitle( String title);
}
