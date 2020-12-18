import java.util.List;

public class BookService {

    private Database database;

    public BookService(Database database) {
        this.database = database;
    }

    public Book download (Book name, Database database){
        return null;
    }
    public boolean rate (Book name, Database database, double rate){
        return false;
    }
    public boolean leaveComment (Book name, Database database, String comment){
        return false;
    }
    public List<Book> getBooks (){
        return null;
    }
}
