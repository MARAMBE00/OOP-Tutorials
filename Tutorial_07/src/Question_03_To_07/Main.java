package Question_03_To_07;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        HashMap<Book, Integer> hmap = new HashMap<Book, Integer>();



        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            if (choice == 1) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter book price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter book year: ");
                int year = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();
                books.add(new Book(title, price, year, author));

                for (int i=0; i<books.size(); i++){
                    System.out.println("Please, enter the number of the shelf where is placed the book" + books.get(i).getTitle());
                    int numShelf = scanner.nextInt();
                    /*Adding elements to HashMap*/
                    hmap.put(books.get(i), numShelf);
                }

                System.out.println("Insert the number of the shelf:");
                int selectedShelf = scanner.nextInt();
                System.out.println("The books in shelf " + selectedShelf + " are:");
                Set set = hmap.entrySet();
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) iterator.next();
                    if (selectedShelf == (int) entry.getValue()) {
                        System.out.println(((Book) entry.getKey()).getTitle());
                    }
                }

            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }


        System.out.println("Books: ");
        for (Book book : books) {
            System.out.println(book);
        }

        Collections.sort(books);

        System.out.println("Book sorted by year: ");
        for (Book book : books){
            System.out.println(book);
        }
    }
}
