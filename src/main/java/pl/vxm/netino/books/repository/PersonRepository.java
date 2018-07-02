package pl.vxm.netino.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.vxm.netino.books.mod.Person;

public interface PersonRepository extends JpaRepository <Person, Long> {

}
