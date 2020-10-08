public class BarcodeNotFoundInShopException extends IllegalArgumentException {
    public BarcodeNotFoundInShopException () {
        super("ไม่มี barcode นี้ในร้าน");
    }

    public BarcodeNotFoundInShopException (String message) {
        super(message);
    }
}
