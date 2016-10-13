package test;

import java.util.Scanner;
import sources.Bookstore;

public class TestBookstore {
    public static void main(String[] args) {
         Bookstore test = new Bookstore();
         Scanner input = new Scanner(System.in);
         int op;
         do{
             System.out.println("Welcome to the bookstore stock!!!");
             System.out.println("What would you like to do?");
             System.out.println("1) Add a book\n2) Show stock\n3) Exit");
             System.out.println("Choose an option:");
             op = input.nextInt();
             input.nextLine();
             switch(op){
                 case 1:
                     test.addBook();
                     break;
                 case 2:
                     test.showStock();
                     break;
                 default:
                     System.out.println("That's not a valid option :/");
             }
         }while(op!=3);
         System.out.println("");
         test.addBook();
         test.showStock();
    }
}
