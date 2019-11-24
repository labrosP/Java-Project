package com.persado.assignment.project.dto;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 *
 * @author maria
 */
public class BookDto {

    @NotBlank
    @Pattern(regexp = "^97[8|9](\\-?[0-9]){7,10}")
    private String isbn;
    @NotBlank
    private String title;
    private String summary;
    private int copies;
    private int loaned;
    private int copiesForLoan;
    private List<UserDto> loaners = new ArrayList<>(2);
    private List<String> loanerNames = new ArrayList<>(2);
    private List<UserDto> usersAvailForLoan = new ArrayList<>(2);

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public int getLoaned() {
        return loaned;
    }

    public void setLoaned(int loaned) {
        this.loaned = loaned;
    }

    public int getCopiesForLoan() {
        return copiesForLoan;
    }

    public void setCopiesForLoan(int copiesForLoan) {
        this.copiesForLoan = copiesForLoan;
    }

    public List<String> getLoanerNames() {
        return loanerNames;
    }

    public void setLoanerNames(List<String> loanerNames) {
        this.loanerNames = loanerNames;
    }

    public void addLoanerName(String loanerName) {
        this.loanerNames.add(loanerName);
    }

    public List<UserDto> getLoaners() {
        return loaners;
    }

    public void setLoaners(List<UserDto> loaners) {
        this.loaners = loaners;
    }

    public List<UserDto> getUsersAvailForLoan() {
        return usersAvailForLoan;
    }

    public void setUsersAvailForLoan(List<UserDto> usersAvailForLoan) {
        this.usersAvailForLoan = usersAvailForLoan;
    }

}
