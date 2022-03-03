package kim.jinhong.BookRecord.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBookMapper {
    void save(Integer userId, Integer bookId);
}
