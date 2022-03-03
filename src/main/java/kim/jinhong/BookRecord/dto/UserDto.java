package kim.jinhong.BookRecord.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Integer userId;
    private String userName;
    private List<BookDto> books;
}
