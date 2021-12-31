package com.example.demo.respository;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "SELECT * FROM user WHERE email = ?1 AND password = ?2",nativeQuery = true)
    Long findByPassword(String email, String password);
}
