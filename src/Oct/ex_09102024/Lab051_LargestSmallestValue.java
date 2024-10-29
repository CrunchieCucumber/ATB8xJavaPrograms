package Oct.ex_09102024;

//Write a Java program that accepts two integer values from the user and returns the largest value.
//However, if the two values are the same, return 0 and find the smallest value
//if the two values have the same remainder when divided by 6.
//Sample Output:
//
//Input the first number : 12
//Input the second number: 13
//Result: 13

import java.util.Scanner;

public class Lab051_LargestSmallestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        if(a%6==0 && b%6==0)
            System.out.println(Math.min(a,b));
        else if (a==b)
            System.out.println(0);
        else
            System.out.println(Math.max(a,b));
    }
}
