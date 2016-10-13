package sources;
public class Book {
    private String title;
    private String author;
    private double price;
    private int id;
    private static int counter;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.id = counter++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book:\n ID = "+ id + "\nTitle : " + title + "\nAuthor : " + author + "\nPrice : $" + price;
    }

}
