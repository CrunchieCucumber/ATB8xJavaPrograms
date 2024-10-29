package Oct.ex_09102024;

//Write a Java program that accepts two integer values between 25 and 75 and
//returns true if there is a common digit in both numbers.
//Sample Output:
//
//Input the first number : 35
//Input the second number: 45
//Result: true

public class Lab052_CommonDigit {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 75;

        int num11=num1%10;
        int num12=num1/10;
        int num21=num2%10;
        int num22=num2/10;

        if(num11==num21 || num11==num22 || num12 ==num21 || num12==num22) System.out.println(true);
        else System.out.println(false);



    }
}
