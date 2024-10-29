package Oct.ex_04102024;

//Write a Java program that accepts three integers from the user and returns true if
//two or more of them (integers) have the same rightmost digit. The integers are non-negative.
//Sample Output:
//Input the first number : 5
//Input the second number: 10
//Input the third number : 15
//The result is: true

import java.util.Scanner;

public class Lab048_Rightmost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3: ");
        int num3 = sc.nextInt();

        int rem1=num1%10;
        int rem2=num2%10;
        int rem3=num3%10;

        if(rem1==rem2 || rem2==rem3 || rem3==rem1) System.out.println("True");
        else System.out.println("False");
    }
}
