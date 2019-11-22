package com.persado.assignment.project.service;

import com.persado.assignment.project.dto.UserDto;
import java.util.List;

/**
 *
 * @author maria
 */
public interface UserService {

    public List<UserDto> findAll();

    public void save(UserDto user);

    public void deleteById(Long userId);

    public int lonedBooksByUser(Long userId);

    public List<UserDto> getUsersAvailableForLoan(String isbn);
}
