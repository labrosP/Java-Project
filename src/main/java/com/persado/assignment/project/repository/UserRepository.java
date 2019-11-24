package com.persado.assignment.project.repository;

import com.persado.assignment.project.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author maria
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT count(u) FROM UserBook bu JOIN  bu.user u WHERE bu.onloan=1 AND u.id=:userId")
    public int lonedBooksByUser(@Param(value = "userId") Long userId);

    @Query("SELECT u1 FROM User u1 WHERE u1.id not in (SELECT u.id FROM UserBook bu JOIN  bu.user u WHERE bu.onloan=1 AND bu.book.isbn=:isbn) ORDER BY u1.lastName")
    public List<User> getUsersAvailableForLoan(@Param(value = "isbn") String isbn);

}
