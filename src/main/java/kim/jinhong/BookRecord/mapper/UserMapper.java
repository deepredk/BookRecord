package kim.jinhong.BookRecord.mapper;

import kim.jinhong.BookRecord.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserDto findOne(Integer userId);
}