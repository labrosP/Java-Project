package com.persado.assignment.project.service;

import com.persado.assignment.project.dto.UserDto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author maria
 */
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl instance;

    /**
     * Test of save method, of class UserServiceImpl.
     */
    @Test
    public void testSaveAndFindAll() {

        int currentUserNumber = instance.findAll().size();
        UserDto u = new UserDto();
        u.setFirstName("Test");
        u.setLastName("User");
        u.setAddress("Athens");
        instance.save(u);
        assertEquals(instance.findAll().size(), currentUserNumber + 1);

    }

    /**
     * Test of deleteById method, of class UserServiceImpl.
     */
    @Test
    public void testDeleteById() {
        int currentUserNumber = instance.findAll().size();
        instance.deleteById(2L);
        assertEquals(instance.findAll().size(), currentUserNumber + -1);
    }
}
