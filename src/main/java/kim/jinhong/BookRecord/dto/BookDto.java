package kim.jinhong.BookRecord.dto;

import lombok.Data;

@Data
public class BookDto {
    private Integer bookId;
    private String bookName;
    private String bookPublisher;
    private String bookAuthor;
}