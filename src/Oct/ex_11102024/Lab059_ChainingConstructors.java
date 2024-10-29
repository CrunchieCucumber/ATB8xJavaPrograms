package Oct.ex_11102024;

//Write a Java program to create a class called Student with instance variables studentId,
//studentName, and grade. Implement a default constructor and a parameterized constructor that
//takes all three instance variables. Use constructor chaining to initialize the variables.
//Print the values of the variables.

public class Lab059_ChainingConstructors {
    //By keeping the instance variables private and initializing them through constructors,
    //the class ensures controlled initialization and data integrity, encapsulating the logic
    //for setting default values within the class itself.
    private int studentId;
    private String studentName;
    private String grade;

    public Lab059_ChainingConstructors() {
        // Call the parameterized constructor with default values
        this(0, "Unknown", "None");
    }

    public Lab059_ChainingConstructors(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Lab059_ChainingConstructors student1 = new Lab059_ChainingConstructors();
        // Print the values of the instance variables for student1
        System.out.println("Student1 ID: " + student1.studentId);
        System.out.println("Student1 Name: " + student1.studentName);
        System.out.println("Student1 Grade: " + student1.grade);

        // Create a new Student object using the parameterized constructor
        Lab059_ChainingConstructors student2 = new Lab059_ChainingConstructors(101, "Cullen", "A");
        // Print the values of the instance variables for student2
        System.out.println("Student2 ID: " + student2.studentId);
        System.out.println("Student2 Name: " + student2.studentName);
        System.out.println("Student2 Grade: " + student2.grade);
        //System.err.println("Error");

    }
}
