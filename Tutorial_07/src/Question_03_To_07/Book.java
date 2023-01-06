package Question_03_To_07;

public class Book implements Comparable<Book>{
    private String title;
    private double price;
    private int year;
    private String author;

    public Book(String title, double price, int year, String author) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", price=" + price + ", year=" + year + ", author='" + author + '\'' + '}';
    }

    @Override
    public int compareTo(Book b) {
        return this.year - b.year;
    }
}
