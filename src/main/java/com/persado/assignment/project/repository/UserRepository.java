package com.persado.assignment.project.repository;

import com.persado.assignment.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author maria
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
