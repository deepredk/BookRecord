package kim.jinhong.BookRecord.service;

import kim.jinhong.BookRecord.dto.UserDto;
import kim.jinhong.BookRecord.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserDto getUserInfo(Integer userId) {
        return userMapper.findById(userId);
    }
}
