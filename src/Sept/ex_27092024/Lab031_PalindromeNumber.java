package Sept.ex_27092024;
import java.util.Scanner;

public class Lab031_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp,rem,rev=0;
        temp=n;

        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if (temp==rev) System.out.println(temp+" is a palindrome number");
        else System.out.println(temp+" is not a palindrome number");
        }

    }
