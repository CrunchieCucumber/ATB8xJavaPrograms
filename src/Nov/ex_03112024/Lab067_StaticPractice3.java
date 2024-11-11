package Nov.ex_03112024;

//Write a Java program to create a class called "Initializer" with a static block that
//initializes a static variable 'initialValue' to 1000. Print the value of 'initialValue' before
//and after creating an instance of "Initializer"

public class Lab067_StaticPractice3 {
    static int initialValue;

    static{
        initialValue = 1000;
        System.out.println("Static block: initialValue initialized to " + initialValue);
    }

    public static void main(String[] args) {
        System.out.println("Before creating an instance: initialValue = " + Lab067_StaticPractice3.initialValue);
        Lab067_StaticPractice3 obj = new Lab067_StaticPractice3();
        System.out.println("Before creating an instance: initialValue = " + obj.initialValue);

    }
}
