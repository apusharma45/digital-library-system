class RealBook implements EBook {
    String bookName;
    public RealBook(String bookName) {
        this.bookName = bookName;
        loadFromDisk(bookName);
    }
    void loadFromDisk(String bookName) {
        System.out.println("loading " + bookName + " from Disk...");
    }
    public void display() {
        System.out.println("loaded successfully");
    }
    
}
