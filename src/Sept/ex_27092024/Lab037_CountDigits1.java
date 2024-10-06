package Sept.ex_27092024;

//count digits present in a number
//1234 has 4 digits

import java.util.Scanner;

public class Lab037_CountDigits1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(int i=10;i>0;i*=10){
            if(num%i==num){
                sum++;
                break;
            }
            sum++;
        }
        System.out.println("The entered number has " +sum+ " digits.");
    }
}
