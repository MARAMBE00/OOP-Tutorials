package Question_03;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    // populate arraylist books with 4 book objects
    public void populate(){
        books.add(new Book("Stephen King", "The Shining"));
        books.add(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("George Orwell", "1984"));
    }

    // print details of all books in the library
    void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book.author + " - " + book.title);
        }
    }
}
