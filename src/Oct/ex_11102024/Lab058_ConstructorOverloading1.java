package Oct.ex_11102024;

//Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:
//
//One constructor takes title and author as parameters.
//The other constructor takes title, author, and price as parameters.
//Print the values of the variables for each constructor.

public class Lab058_ConstructorOverloading1 {
    String title,author;
    int price;

    Lab058_ConstructorOverloading1(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    Lab058_ConstructorOverloading1(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 550;
    }

    Lab058_ConstructorOverloading1(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Lab058_ConstructorOverloading1 book1 = new Lab058_ConstructorOverloading1();
        System.out.println("Book1 Title: " + book1.title);
        System.out.println("Book1 Author: " + book1.author);
        System.out.println("Book1 Price: " + book1.price);

        // Create a new Book object using the parameterized constructor (title, author)
        Lab058_ConstructorOverloading1 book2 = new Lab058_ConstructorOverloading1("Before the Coffee Gets Cold", "Toshikazu Kawaguchi");
        // Print the values of the instance variables for book2
        System.out.println("Book2 Title: " + book2.title);
        System.out.println("Book2 Author: " + book2.author);
        System.out.println("Book2 Price: " + book2.price);

        // Create a new Book object using the parameterized constructor (title, author, price)
        Lab058_ConstructorOverloading1 book3 = new Lab058_ConstructorOverloading1("Ramayana Unravelled", "Ami Ganatra", 599);
        // Print the values of the instance variables for book3
        System.out.println("Book3 Title: " + book3.title);
        System.out.println("Book3 Author: " + book3.author);
        System.out.println("Book3 Price: " + book3.price);
    }
}
