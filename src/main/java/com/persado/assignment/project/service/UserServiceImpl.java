package com.persado.assignment.project.service;

import com.persado.assignment.project.dto.UserDto;
import com.persado.assignment.project.mapper.UserMapper;
import com.persado.assignment.project.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author maria
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepo, UserMapper userMapper) {
        this.userRepo = userRepo;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDto> findAll() {
        return userMapper.entityToDtoLsit(userRepo.findAll(Sort.by("lastName", "firstName")));
    }

    @Transactional
    public void save(UserDto user) {
        userRepo.save(userMapper.dtoToEntity(user));
    }

    @Transactional
    public void deleteById(Long userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public int lonedBooksByUser(Long userId) {
        return userRepo.lonedBooksByUser(userId);
    }

    @Override
    public List<UserDto> getUsersAvailableForLoan(String isbn) {
        return userMapper.entityToDtoLsit(userRepo.getUsersAvailableForLoan(isbn));
    }

}
