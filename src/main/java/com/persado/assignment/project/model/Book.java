package com.persado.assignment.project.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author maria
 */
@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "isbn", length = 255)
    private String isbn;
    @Column(length = 255)
    private String title;
    @Column(length = 500)
    private String summary;
    @Column(columnDefinition = "int default 0")
    private int copies;
    private int copiesForLoan = 0;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "user_book", joinColumns = {
        @JoinColumn(name = "isbn")}, inverseJoinColumns = {
        @JoinColumn(name = "user_id")})
    private List<User> onLoanUsers;

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

    public int getCopiesForLoan() {
        return copiesForLoan;
    }

    public void setCopiesForLoan(int copiesForLoan) {
        this.copiesForLoan = copiesForLoan;
    }

    public List<User> getOnLoanUsers() {
        return onLoanUsers;
    }

    public void setOnLoanUsers(List<User> onLoanUsers) {
        this.onLoanUsers = onLoanUsers;
    }

}
