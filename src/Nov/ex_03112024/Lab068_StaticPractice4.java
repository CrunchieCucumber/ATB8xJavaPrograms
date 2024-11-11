package Nov.ex_03112024;

//Write a Java program to create a class called "ComplexInitializer" with a static block
//that initializes multiple static variables (x, y, z) using complex logic.
//Print the values of these variables in the main method.

public class Lab068_StaticPractice4 {
    private static int x,y,z;

    static{
        x=10;
        y=20;
        z= CalculateZ(x,y);
    }

    private static int CalculateZ(int a,int b){
        return a*b + (a-b);
    }

    public static void main(String[] args) {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}
