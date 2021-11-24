import java.util.ArrayList;
import java.util.List;

public class Book {
    public static List<Book> books = new ArrayList<>();
    private int id;
    private String name;
    private String author;
    private int year;
    private int numberOfPages;
    private double price;
    private String type;

    public Book(int id, String name, String author, int year, int numberOfPages, double price, String type){
        this.id = id;
        this.name = name;
        this.author=author;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price=price;
        this.type=type;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages=numberOfPages;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
