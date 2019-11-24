package com.persado.assignment.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author maria
 */
@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "isbn")
    @Length(min = 10, max = 22)
    @NotNull
    @Pattern(regexp = "^97[8|9](\\-?[0-9]){7,10}")
    /*   isbn is a 10 or 13 digit number, can contain
            dashes and starts with 978 or 979 */
    private String isbn;
    @Column(length = 255)
    @NotNull
    private String title;
    @Column(length = 1500)
    private String summary;
    @Column(columnDefinition = "int default 0")
    private int copies = 0;
    @Column(columnDefinition = "int default 0")
    private int copiesForLoan = 0;

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "book", orphanRemoval = true)
    private List<UserBook> userbookList = new ArrayList<>(2);

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

    public List<UserBook> getUserbookList() {
        return userbookList;
    }

    public void addUserbook(UserBook userbook) {
        this.userbookList.add(userbook);
    }

    public void setUserbookList(List<UserBook> userbookList) {
        this.userbookList = userbookList;
    }

}
