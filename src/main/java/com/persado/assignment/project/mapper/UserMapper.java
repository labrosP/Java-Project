/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persado.assignment.project.mapper;

import com.persado.assignment.project.dto.UserDto;
import com.persado.assignment.project.model.User;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author maria
 */
@Mapper(componentModel = "spring")
public abstract class UserMapper {

    public abstract User dtoToEntity(UserDto userdto);

    public abstract UserDto entityToDto(User User);

    public abstract List<UserDto> entityToDtoLsit(List<User> users);

}
