package Sept.ex_30092024;

//153 = 1^3+5^3+3^3 = 153

import java.util.Scanner;

public class Lab040_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rem,temp;
        double res=0;

        temp = num;

        while(temp>0){
            rem=temp%10;
            res+=Math.pow(rem,3);
            temp=temp/10;
        }
        if(res==num) System.out.println("Number is armstrong");
        else System.out.println("Number is not armstrong");
    }
}
