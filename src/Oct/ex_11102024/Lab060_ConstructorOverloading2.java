package Oct.ex_11102024;

//Overloading Constructors with Different Data Types
//Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:
//
//One constructor takes int parameters.
//Another constructor takes double parameters.
//Print the values of the variables for each constructor.

public class Lab060_ConstructorOverloading2 {
    private int x;
    private int y;

    // Constructor that takes int parameters
    public Lab060_ConstructorOverloading2(int x, int y) {
        // Initialize instance variables
        this.x = x;
        this.y = y;
    }

    // Constructor that takes double parameters
    public Lab060_ConstructorOverloading2(double x, double y) {
        // Initialize instance variables by casting double to int
        this.x = (int)x;
        this.y = (int)y;
    }

    // Method to print the values of x and y
    public void printPoint() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Lab060_ConstructorOverloading2 point1 = new Lab060_ConstructorOverloading2(4, 5);
        // Print the values of point1
        point1.printPoint();

        // Create a Point object using the double constructor
        Lab060_ConstructorOverloading2 point2 = new Lab060_ConstructorOverloading2(4.5, 5.5);
        // Print the values of point2
        point2.printPoint();
    }

}
