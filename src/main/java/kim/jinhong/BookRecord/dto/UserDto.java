package kim.jinhong.BookRecord.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private int userId;
    private String userName;
    private List<BookDto> books;
}
