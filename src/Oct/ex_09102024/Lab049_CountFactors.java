package Oct.ex_09102024;

//Write a Java program to accept an integer and count the factors of the number.
//Input an integer: 25
//Sample Output:3

import java.util.Scanner;

public class Lab049_CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;

        for(int i=1;i<=num;i++){
            if(num%i==0) count++;
        }
        System.out.println("The total factors of number "+num+ " are " +count);
    }
}
