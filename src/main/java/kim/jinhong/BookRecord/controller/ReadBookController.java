package kim.jinhong.BookRecord.controller;

import kim.jinhong.BookRecord.service.ReadBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadBookController {
    @Autowired
    private ReadBookService readBookService;

    @PostMapping("/readBook")
    public ResponseEntity readBook(@RequestParam Integer userId, @RequestParam Integer bookId) {
        readBookService.readBook(userId, bookId);
        return new ResponseEntity(HttpStatus.OK);
    }
}
