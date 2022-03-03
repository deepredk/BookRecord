package kim.jinhong.BookRecord.service;

import kim.jinhong.BookRecord.dto.BookDto;
import kim.jinhong.BookRecord.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<BookDto> getBooks() {
        return bookMapper.findAll();
    }

    public BookDto getBook(Integer bookId) {
        return bookMapper.findById(bookId);
    }

    public Integer addBook(String bookName, String bookPublisher, String bookAuthor) {
        return bookMapper.save(bookName, bookPublisher, bookAuthor);
    }
}
