package Sept.ex_30092024;

import java.util.Scanner;

//1234 % 1230 = 4
//123 % 120 = 3
//12 % 10 = 2

//Sum of digits: 1234 has 1+2+3+4=10 digits

public class Lab041_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = sc.nextInt();
        int sum=0,rem;

        while(number!=0){
            rem=number%10;
            number/=10;
            sum+=rem;
        }
        System.out.println(sum);
    }
}
