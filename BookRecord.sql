-- 테이블 순서는 관계를 고려하여 한 번에 실행해도 에러가 발생하지 않게 정렬되었습니다.

-- User Table Create SQL
CREATE TABLE User
(
    `user_id`    INT            NOT NULL    AUTO_INCREMENT COMMENT '사용자 고유번호', 
    `user_name`  VARCHAR(45)    NOT NULL    COMMENT '사용자 이름', 
     PRIMARY KEY (user_id)
) DEFAULT CHARACTER SET UTF8MB4;


-- Book Table Create SQL
CREATE TABLE Book
(
    `book_id`         INT            NOT NULL    AUTO_INCREMENT COMMENT '책 고유번호', 
    `book_name`       VARCHAR(45)    NULL        COMMENT '책 이름', 
    `book_publisher`  VARCHAR(45)    NULL        COMMENT '출판사', 
    `book_author`     VARCHAR(45)    NULL        COMMENT '저자', 
     PRIMARY KEY (book_id)
) DEFAULT CHARACTER SET UTF8MB4;


-- User_Book Table Create SQL
CREATE TABLE User_Book
(
    `user_id`  INT    NOT NULL    COMMENT '사용자 고유번호', 
    `book_id`  INT    NOT NULL    COMMENT '책 고유번호'
) DEFAULT CHARACTER SET UTF8MB4;

ALTER TABLE User_Book
    ADD CONSTRAINT FK_User_Book_user_id_User_user_id FOREIGN KEY (user_id)
        REFERENCES User (user_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE User_Book
    ADD CONSTRAINT FK_User_Book_book_id_Book_book_id FOREIGN KEY (book_id)
        REFERENCES Book (book_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

INSERT INTO User(user_name)
VALUES("김진홍");

INSERT INTO Book(book_name, book_publisher, book_author)
VALUES("토비의 스프링 3.1", "에이콘출판사", "이일민");