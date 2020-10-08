public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        Book java = new Book("Java", "Expert Java", 499);
        Book javafx = new Book("JavaFX", "Expert Java", 529);
        Book springBoot = new Book("Java Spring Boot", "Expert Java", 749);
        Book python = new Book("Basic Python", "Expert Python", 619);
        Book ml = new Book("Machine Learning with Python", "Expert Python", 799);

        store.stockIn("001", java);
        store.stockIn("001", java);
        store.stockIn("001", java);
        store.stockIn("001", java);

        store.stockIn("002", javafx);
        store.stockIn("002", javafx);
        store.stockIn("002", javafx);

        store.stockIn("003", springBoot);
        store.stockIn("003", springBoot);
        store.stockIn("003", springBoot);
        store.stockIn("003", springBoot);
        store.stockIn("003", springBoot);

        store.stockIn("004", python);

        store.stockIn("005", ml);
        store.stockIn("005", ml);
        store.stockIn("005", ml);
        store.stockIn("005", ml);
        store.stockIn("005", ml);
        store.stockIn("005", ml);
        store.stockIn("005", ml);

        System.out.println("Total Books: " + store.countAllBooks());

        try {
            System.out.println("Buying " + store.buy("004", 80).getTitle());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BarcodeNotFoundInShopException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("ขออภัยคุณลูกค้า " + e.getMessage());
        }

        System.out.println("-----------1--------------");
        System.out.println("Total Books: " + store.countAllBooks());

        try {
            System.out.println("Buying " + store.buy("004", 800).getTitle());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BarcodeNotFoundInShopException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("ขออภัยคุณลูกค้า " + e.getMessage());
        }

        System.out.println("-----------2--------------");
        System.out.println("Total Books: " + store.countAllBooks());

        try {
            System.out.println("Buying " + store.buy("004", 1800).getTitle());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BarcodeNotFoundInShopException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("ขออภัยคุณลูกค้า " + e.getMessage());
        }

        System.out.println("-----------3--------------");
        System.out.println("Total Books: " + store.countAllBooks());

        try {
            System.out.println("Buying " + store.buy("777", 2000).getTitle());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BarcodeNotFoundInShopException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("ขออภัยคุณลูกค้า " + e.getMessage());
        }

        System.out.println("-----------4--------------");
        System.out.println("Total Books: " + store.countAllBooks());

        System.out.println("Number of books by Expert Java: " + store.countBooksByAuthor("Expert Java"));


    }
}
