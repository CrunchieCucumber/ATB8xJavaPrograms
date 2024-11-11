package Nov.ex_03112024;

//Write a Java program to create a class called "MathUtility" with a static method add,
//that takes two integers and returns their sum.Demonstrate the usage of this static method
//in the main method without creating an instance of "MathUtility".

public class Lab066_StaticPractice2 {

    public static int Add(int a,int b){
        return(a+b);
    }

    public static void main(String[] args) {
        int sum = Lab066_StaticPractice2.Add(2,6);
        System.out.println("Sum of the numbers is " +sum);
    }
}
