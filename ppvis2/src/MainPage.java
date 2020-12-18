import java.util.List;

public class MainPage {

    private Filter filter;
    private UserService userService;
    private BookService bookService;

    public MainPage(UserService userService) {
        this.userService = userService;
        this.filter = new Filter();
    }

    public List<Book> getBooks (){
        return bookService.getBooks();
    }
    public void selectBook(Book name, BookPage num, boolean isBook){

    }
    public boolean authorize(UserService userService){
        return false;
    }
    public boolean registrate (UserService userService){
        return false;
    }

}
