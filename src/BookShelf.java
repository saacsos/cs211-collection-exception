import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class BookShelf {
    private Collection<Book> books;

    public BookShelf() {
        books = new LinkedList<>();
    }

    public int countBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book popBook() {
        for (Book book: books)
            return book;
        return null;
    }

    public void deleteByTitle(String title) {
        for (Book book: books) {
            if (book.isTitle(title)) {
                books.remove(book);
                break;
            }
        }
    }

    public double totalPrice() {
        double total = 0;
        Iterator<Book> pointer = books.iterator();
        while (pointer.hasNext()) {
            Book book = pointer.next();
            total += book.getPrice();
        }
        return total;
    }
}
