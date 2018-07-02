package pl.vxm.netino.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.vxm.netino.books.mod.Book;

import java.util.List;

public interface BookRepository <Book, Long> {

    public List<Book> findAll();
}
