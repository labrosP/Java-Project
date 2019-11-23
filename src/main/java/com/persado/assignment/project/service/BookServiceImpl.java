package com.persado.assignment.project.service;

import com.persado.assignment.project.dto.BookDto;
import com.persado.assignment.project.mapper.BookMapper;
import com.persado.assignment.project.model.Book;
import com.persado.assignment.project.model.User;
import com.persado.assignment.project.model.UserBook;
import com.persado.assignment.project.repository.BookRepository;
import com.persado.assignment.project.repository.UserRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maria
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepo;
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private BookMapper bookMapper;

    public BookServiceImpl(BookRepository bookRepo, BookMapper bookMapper) {
        this.bookRepo = bookRepo;
        this.bookMapper = bookMapper;
    }

    @Override
    public List<BookDto> findAll() {
        return bookMapper.entityToDtoLsit(bookRepo.findAll());
    }

    @Override
    public boolean isbnExists(String isbn) {
        Optional<Book> res = bookRepo.findById(isbn);
        return res.isPresent();
    }

    @Override
    public void save(BookDto book) {
        bookRepo.save(bookMapper.dtoToEntity(book));
    }

    @Override
    public void deleteById(String isbn) {
        bookRepo.deleteById(isbn);
    }

    @Override
    public List<BookDto> findAllAvailable() {
        List<BookDto> all = findAll();
        List<BookDto> list = bookMapper.entityToDtoLsit(bookRepo.findAllAvailable());
        for (BookDto book : list) {

        }

        return list;
    }

    @Override
    public List<BookDto> findAllOnLoan() {
        return bookMapper.entityToDtoLsit(bookRepo.findAllOnLoan());
    }

    @Override
    public void returnBook(String isbn, Long userId) {
        Optional<Book> res = bookRepo.findById(isbn);
        Optional<User> userRes = userRepo.findById(userId);
        if (res.isPresent() && userRes.isPresent()) {
            Book book = res.get();
            Optional<UserBook> userBook = book.getUserbookList().stream().
                    filter(x -> x.getUser().getId() == userId).findAny();
            if (userBook.isPresent()) {
                userBook.get().setOnloan(false);
                userBook.get().setReturnDate(new Date());
                book.setCopiesForLoan(book.getCopiesForLoan() + 1);
            }
            bookRepo.save(book);
        }
    }

    @Override
    public void loanBook(String isbn, Long userId) {
        Optional<Book> res = bookRepo.findById(isbn);
        Optional<User> userRes = userRepo.findById(userId);
        if (res.isPresent() && userRes.isPresent()) {
            Book book = res.get();
            UserBook loan = new UserBook(userRes.get(), book, new Date());
            book.setCopiesForLoan(book.getCopiesForLoan() - 1);
            book.addUserbook(loan);
            bookRepo.save(book);
        }
    }

}
