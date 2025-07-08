// Author.java
package oops;

class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

// Book.java
class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Book[name=" + name + ", " + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
    }
}

// Main.java
public class Main1 {
    public static void main(String[] args) {
        // Create an author
        Author author = new Author("Bhavana Rao", "bhavana@example.com", 'F');

        // Create a book with the author
        Book book = new Book("Journey to Mars", author, 399.99, 50);

        // Print book details
        System.out.println(book);
    }
}
