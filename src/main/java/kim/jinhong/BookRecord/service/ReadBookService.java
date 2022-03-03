package kim.jinhong.BookRecord.service;

import kim.jinhong.BookRecord.mapper.UserBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadBookService {
    @Autowired
    private UserBookMapper userBookMapper;

    public void readBook(Integer userId, Integer bookId) {
        userBookMapper.save(userId, bookId);
    }
}
