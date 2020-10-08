import java.util.Map;
import java.util.TreeMap;

public class BookStore {
    private Map<String, BookShelf> shop;

    public BookStore() {
        shop = new TreeMap<>();
    }

    public void stockIn(String barcode, Book book) {
        BookShelf shelf = shop.get(barcode);
        if (shelf == null) {
            shelf = new BookShelf();
            shop.put(barcode, shelf);
        }
        shelf.addBook(book);
    }

    public int countAllBooks() {
        int count = 0;
        for (String barcode : shop.keySet()) {
            BookShelf shelf = shop.get(barcode);
            count += shelf.countBooks();
        }
        return count;
    }

    public double totalPrice() {
        double total = 0;
        for (BookShelf shelf : shop.values()) {
            total += shelf.totalPrice();
        }
        return total;
    }

    public Book buy(String barcode, double cost) throws ClassNotFoundException {
        Book book = null;
        BookShelf shelf = shop.get(barcode);
        if (shelf == null) {
            // Unchecked Exception
            throw new BarcodeNotFoundInShopException();
        }

        book = shelf.popBook();
        if (book == null) {
            // Checked Exception, must declare in method signature
            throw new ClassNotFoundException("หนังสือเล่มนี้หมด");
        }

        if (cost < book.getPrice()) {
            // Unchecked Exception
            throw new IllegalArgumentException("เงินไม่พอซื้อหนังสือเล่มนี้");
        }

        shelf.deleteByTitle(book.getTitle());

        return book;
    }

    /**
     * Challenge: นับจำนวนหนังสือทั้งหมดที่แต่งโดยชื่อผู้แต่งนี้ในร้าน
     * @param authorName ชื่อผู้แต่ง
     * @return จำนวนหนังสือที่แต่งโดยชื่อผู้แต่งนี้
     */
    public int countBooksByAuthor(String authorName) {
        int count = 0;


        return count;
    }
}
