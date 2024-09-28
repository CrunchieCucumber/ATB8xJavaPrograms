package Sept.ex_27092024;
//Swapping two numbers without using a temporary variable
//a=10,b=20
//b=b+a
//a=b-a
//b=b-a

import java.util.Scanner;

public class Lab034_SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();

        System.out.println("Before swapping, a is " + a +" and b is " + b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping, a is " + a +" and b is " + b);
    }
}
