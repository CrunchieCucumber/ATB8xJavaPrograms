package Oct.ex_02102024;

import java.util.Scanner;

//1234 % 1230 = 4
//123 % 120 = 3
//12 % 10 = 2

//count digits present in a number
//1234 has 4 digits

public class Lab042_CountDigits2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = sc.nextInt();
        int count=0,rem;

        while(number!=0){
            rem=number%10;
            number/=10;
            count++;
        }
        System.out.println("Total number of digits in the number is: " +count);
    }
}
