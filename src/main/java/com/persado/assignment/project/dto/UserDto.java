package com.persado.assignment.project.dto;

import java.util.List;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author maria
 */
public class UserDto {

    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    private String address;
    private List<String> bookNames;
    private int booksOnloan;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getBookNames() {
        return bookNames;
    }

    public void setBookNames(List<String> bookNames) {
        this.bookNames = bookNames;
    }

    public int getBooksOnloan() {
        return booksOnloan;
    }

    public void setBooksOnloan(int booksOnloan) {
        this.booksOnloan = booksOnloan;
    }

}
