public class Main {
    public static void main(String[] args) {
        ProxyBook book = new ProxyBook("hello.pdf");
        book.display();
        book.display();
        ProxyBook book2 = new ProxyBook("hello2.pdf");
        book2.display();
        book2.display();

    }
}
