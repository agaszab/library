package pl.vxm.netino.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.vxm.netino.books.mod.Person;

import java.util.List;

public interface PersonRepository extends JpaRepository <Person, Long> {
    List<Person> findAllByLastName(String name);

}
