//class Author{
//private String name;
//private String email;
//private char gender;
//
//public Author(String name, String email, char gender) {
//    this.name = name;
//    this.email = email;
//    this.gender = gender;
//}
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public char getGender() {
//        return gender;
//    }
//
//    public String toString(){
//        return "Author name = " + name + ", \nemail = " + email + "\ngender " + gender + "\n";
//    }
//}
//
//class Book {
//    String name;
//    Author author;
//    double price;
//    int qtyInStock;
//
//    public Book(String name, Author author, double price, int qtyInStock) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//        this.qtyInStock = qtyInStock;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public Author getAuthor() {
//        return this.author;
//    }
//
//    public double getPrice() {
//        return this.price;
//    }
//
//    public int getQtyInStock() {
//        return this.qtyInStock;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setQtyInStock(int qtyInStock) {
//        this.qtyInStock = qtyInStock;
//    }
//
//    public String toString() {
//        return "Book name: " + name + " \nAuthor: " + author + "\nprice: " + price + "\nqtyInStock: " + qtyInStock;
//    }
//
//
//
//}
//
//public class AuthorBook {
//    public static void main(String[] args) {
//        Author a = new Author("Sherlock Holmes", "sherhol@gmail.com", 'M');
//        Book b = new Book("The Adventures of Sherlock Holmes", a, 12.99, 100);
//        b.setPrice(15.99);
//        System.out.println(a);
//        System.out.println(b);
//
//    }
//}
