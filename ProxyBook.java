class ProxyBook implements EBook{
    String bookName;
    RealBook realBook;
    public ProxyBook(String bookName) {
        this.bookName = bookName;
    }
    public void display() {
        if(realBook == null) {
            realBook = new RealBook(bookName);
        }
        realBook.display();
    }
    
}
