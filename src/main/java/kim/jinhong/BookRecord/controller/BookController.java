package kim.jinhong.BookRecord.controller;

import kim.jinhong.BookRecord.dto.BookDto;
import kim.jinhong.BookRecord.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public BookDto getBook(@PathVariable Integer bookId) {
        return bookService.getBook(bookId);
    }
}
