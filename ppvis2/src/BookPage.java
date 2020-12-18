import java.util.List;

public class BookPage {
    private boolean authorized;

    private BookService bookService;

    public BookPage(BookService bookService) {
        this.bookService = bookService;
    }

    public List<String> download (BookService bookService){
        return null;
    }
    public boolean leaveComment (Book name, BookService bookService){
        return false;
    }
    public boolean rate (Book name, BookService bookService){
        return false;
    }
}
