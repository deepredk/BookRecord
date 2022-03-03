# BookService
## User
### GET /users/{id}
* {id}에 userId를 넣으면 유저의 정보를 조회함
* userId, userName, books(읽은 책들)이 나옴

### POST /users
* Request Body에 userName을 넣으면 새로운 유저를 만듬

## Book
### GET /books
* 책 목록이 배열 형태로 나옴
* 각 책 별로 bookId, bookName, bookPublisher, bookAuthor 정보를 제공

### GET /books/{id}
* {id}에 bookId를 넣으면 책 정보를 조회함
* bookId, bookName, bookPublisher, bookAuthor이 나옴

### PUT /books/{id}
* {id}에 bookId를 넣고 Request Body에 bookName, bookPublisher, bookAuthor를 넣으면 책 정보를 수정함

### DELETE /books/{id}
* {id}에 bookId를 넣으면 책을 삭제함

## User_Book
### POST /readBook
* Request Body에 userId, bookId를 넣으면
* 해당 유저가 그 책을 읽었다고 기록함