package com.persado.assignment.project.service;

import com.persado.assignment.project.dto.BookDto;
import java.util.List;

/**
 *
 * @author maria
 */
public interface BookService {

    public List<BookDto> findAll();

    public boolean isbnExists(String isbn);

    public void save(BookDto book);

    public void deleteById(String isbn);

    public List<BookDto> findAllAvailable();

    public List<BookDto> findAllOnLoan();

    public void returnBook(String isbn, Long userId);

    public void loanBook(String isbn, Long userId);

}
