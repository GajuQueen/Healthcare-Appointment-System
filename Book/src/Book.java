public class Book {
    private String title;
    private String author;

    public Book(){
        this.title = "unknown";
        this.author = "anonymous";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayinfo(){
        System.out.println("Title: " + title + " Author: " + author);
    }
}
