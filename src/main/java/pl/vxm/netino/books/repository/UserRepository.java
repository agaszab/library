package pl.vxm.netino.books.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.vxm.netino.books.mod.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


    public User findById(long id);

    public User findByUsername(String username);
}