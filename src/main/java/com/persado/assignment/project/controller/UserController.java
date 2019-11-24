package com.persado.assignment.project.controller;

import com.persado.assignment.project.dto.UserDto;
import com.persado.assignment.project.service.UserService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author maria
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String getUserList(Model theModel) {
        List<UserDto> userList = userService.findAll();
        theModel.addAttribute("users", userList);
        return "/user/user-list";
    }

    @GetMapping("/add-user")
    public String goToUserCreateForm(Model model) {
        UserDto UserDto = new UserDto();
        model.addAttribute("user", UserDto);
        return "/user/create-user";
    }

    @PostMapping("/create")
    public String createUser(@Valid @ModelAttribute("user") UserDto userDto) {
        userService.save(userDto);
        return "redirect:/users/list";
    }

    @DeleteMapping("delete/{userId}")
    public String deleteUser(@PathVariable("userId") Long userId) {
        if (userService.lonedBooksByUser(userId) > 0) {
            throw new IllegalStateException("User with has books on loan and can not be deleted");
        }
        userService.deleteById(userId);
        return "redirect:/users/list";
    }

}
