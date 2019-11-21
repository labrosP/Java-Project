package com.persado.assignment.project.dto;

/**
 *
 * @author maria
 */
public class BookDto {

    private String isbn;
    private String title;
    private String summary;
    private int copies;
    private int copiesForLoan;

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

}
