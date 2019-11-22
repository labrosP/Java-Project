package com.persado.assignment.project.mapper;

import com.persado.assignment.project.dto.BookDto;
import com.persado.assignment.project.dto.UserDto;
import com.persado.assignment.project.model.Book;
import com.persado.assignment.project.model.User;
import com.persado.assignment.project.model.UserBook;
import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author maria
 */
@Mapper(componentModel = "spring")
public abstract class BookMapper {

    @Autowired
    private UserMapper userMapper;

    public abstract Book dtoToEntity(BookDto bookDto);

    public abstract List<BookDto> entityToDtoLsit(List<Book> books);

    public List<UserDto> mapUsers(List<User> users) {
        return userMapper.entityToDtoLsit(users);
    }

    @AfterMapping
    public void loanedBooks(Book book, @MappingTarget BookDto bookDto) {
        bookDto.setLoaned(book.getCopies() - book.getCopiesForLoan());
        //set users that has the book onloan

        List<User> users = book.getUserbookList().stream()
                .filter(x -> x.isOnloan())
                .map(UserBook::getUser)
                .collect(Collectors.toList());
        bookDto.setLoaners(userMapper.entityToDtoLsit(users));
        //set users' name that has the book onloan
        bookDto.setLoanerNames(bookDto.getLoaners()
                .stream().map(UserDto::getLastName)
                .collect(Collectors.toList()));
    }

}
