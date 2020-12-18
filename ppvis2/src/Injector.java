import sun.applet.Main;

public class Injector {

    public void init() {

        Database database = new Database();

        UserService userService = new UserService(database);
        BookService bookService = new BookService(database);


        BookPage bookPage = new BookPage(bookService);
        MainPage mainPage = new MainPage(userService);

        FrontController frontController = new FrontController(mainPage, bookPage);
    }
}
