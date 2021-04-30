package com.persado.assignment.project.model;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author maria
 */
@Entity
@Table(name = "user_book")
public class UserBook {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UserBook_generator")
    @SequenceGenerator(name = "UserBook_generator", sequenceName = "UserBook_seq", allocationSize = 1)
    private Long userBookId;

    @ManyToOne
    @NotNull
    @JoinColumn(nullable = false, name = "user_id", updatable = false)
    private User user;

    @ManyToOne
    @NotNull
    @JoinColumn(nullable = false, name = "isbn", updatable = false)
    private Book book;

    @Temporal(TemporalType.DATE)
    private Date loanDate;

    @Temporal(TemporalType.DATE)
    private Date returnDate;

    @Column(nullable = false, columnDefinition = "tinyint(1) default 1")
    private boolean onloan = true;

    public UserBook(User user, Book book, Date loanDate) {
        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
    }

    public UserBook(User user, Book book, Date loanDate, Date returnDate) {
        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public UserBook() {
    }

    public Long getUserBookId() {
        return userBookId;
    }

    public void setUserBookId(Long userBookId) {
        this.userBookId = userBookId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isOnloan() {
        return onloan;
    }

    public void setOnloan(boolean onloan) {
        this.onloan = onloan;
    }

}
