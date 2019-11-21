package com.persado.assignment.project.mapper;

import com.persado.assignment.project.dto.BookDto;
import com.persado.assignment.project.model.Book;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author maria
 */
@Mapper(componentModel = "spring")
public abstract class BookMapper {

    public abstract Book dtoToEntity(BookDto bookDto);

    public abstract BookDto entityToDto(Book book);

    public abstract List<BookDto> entityToDtoLsit(List<Book> books);

}
