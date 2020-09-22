class Author {
    private String name;
    private String email;
    private String gender;

    Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    String getName() {
        return name;
    }
    String getEmail() {
        return email;
    }
    String getGender() {
        return gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        price = price;
        qtyInStock = qty;
    }

    String getName() {
        return name;
    }

    Author getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getQtyInStock() {
        return qtyInStock;
    }
    void setPrice(double price) {
        this.price = price;
    }

    void setQtyInStock(int qty) {
        this.qtyInStock = qty;
    }
}

class Main {
    public static void main(String[] args) {
        Author author = new Author("Shayan", "shayansaha.work@gmail.com", "Male");
        Book my_book = new Book("Art of Livinig", author, 399, 5);
        
        System.out.println("Name of the book is: " + my_book.getName());
        System.out.println("Author of the book is: " + my_book.getAuthor().getName() + ", " +
                            "Email: " + my_book.getAuthor().getEmail() + ", "+
                            "Gender: " + my_book.getAuthor().getGender());
    }
}