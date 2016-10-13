package sources;

import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {
    ArrayList<Book> stock = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int nBooks;
    public void addBook(){
         Book book = new Book("","",0);
         System.out.println("Enter the book title: ");
         String title = input.nextLine();
         book.setTitle(title);
         System.out.println("Enter the book author: "); 
         String author = input.nextLine();
         book.setAuthor(author);
         System.out.println("What's the price of the book? ");
         double price = input.nextDouble();
         book.setPrice(price);
         stock.add(book);
         input.nextLine();
    }
    public void showStock(){
        System.out.println(""+stock.toString());
    }

    public Bookstore() {
    }
    
}
