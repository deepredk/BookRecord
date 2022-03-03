package kim.jinhong.BookRecord.mapper;

import kim.jinhong.BookRecord.dto.BookDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<BookDto> findAll();
    BookDto findById(Integer bookId);
}
