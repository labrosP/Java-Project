/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persado.assignment.project.mapper;

import com.persado.assignment.project.dto.UserDto;
import com.persado.assignment.project.model.User;
import com.persado.assignment.project.service.UserService;
import java.util.List;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author maria
 */
@Mapper(componentModel = "spring")
public abstract class UserMapper {

    @Autowired
    private UserService userService;

    public abstract User dtoToEntity(UserDto userdto);

    public abstract UserDto entityToDto(User User);

    public abstract List<UserDto> entityToDtoLsit(List<User> users);

    @AfterMapping
    public void setBooksOnLoan(User user, @MappingTarget UserDto userDto) {
        userDto.setBooksOnloan(userService.lonedBooksByUser(user.getId()));
    }

}
