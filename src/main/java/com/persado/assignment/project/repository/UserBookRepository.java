package com.persado.assignment.project.repository;

import com.persado.assignment.project.model.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author maria
 */
public interface UserBookRepository extends JpaRepository<UserBook, String> {

}
