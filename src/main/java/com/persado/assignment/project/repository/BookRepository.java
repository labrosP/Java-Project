package com.persado.assignment.project.repository;

import com.persado.assignment.project.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author maria
 */
public interface BookRepository extends JpaRepository<Book, String> {

}
