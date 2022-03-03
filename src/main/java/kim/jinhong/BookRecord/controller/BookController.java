package kim.jinhong.BookRecord.controller;

import kim.jinhong.BookRecord.dto.BookDto;
import kim.jinhong.BookRecord.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping("/books")
    public ResponseEntity<BookDto> addBook(@RequestParam String bookName,
                                           @RequestParam String bookPublisher,
                                           @RequestParam String bookAuthor) {
        Integer bookId = bookService.addBook(bookName, bookPublisher, bookAuthor);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(bookId)
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
