package com.persado.assignment.project.repository;

import com.persado.assignment.project.model.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author maria
 */
public interface BookRepository extends JpaRepository<Book, String> {

    @Query("SELECT b FROM Book b where b.copiesForLoan>0")
    public List<Book> findAllAvailable();

    @Query("SELECT b FROM Book b where b.copies!=b.copiesForLoan")
    public List<Book> findAllOnLoan();

}
