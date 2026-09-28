public class Book {
    private String title;
    private int pages;
    Book(){
        title = "Unknown";
        pages = 0;
    }

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.title);
        System.out.println(book.pages);
    }
}
