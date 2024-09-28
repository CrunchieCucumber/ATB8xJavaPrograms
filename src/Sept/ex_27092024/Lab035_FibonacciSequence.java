package Sept.ex_27092024;

import java.util.Scanner;

//0,1,1,2,3,5,8,13...

public class Lab035_FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the end limit of fibonacci series: ");
        int limit = sc.nextInt();
        int num1 = 0, num2=1, sum=0;
        for(int i=0;i<limit;i++){
            System.out.print(num1 + " ");
            sum=num1+num2;
            num1=num2;
            num2=sum;
        }
    }
}
