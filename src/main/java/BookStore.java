import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> bookShelf = new ArrayList<>();

    public void addBook(Book book){
        bookShelf.add(book);
    }
    public void listBook(){
        bookShelf.forEach(System.out::println);
    }


}
