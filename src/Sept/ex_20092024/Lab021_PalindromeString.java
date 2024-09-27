package Sept.ex_20092024;
import java.util.Scanner;

//This is working for both String and Number

public class Lab021_PalindromeString {
    public static void main(String[] args) {
        //Palindrome word - deed
        String original,reverse = "";
        Scanner sc= new Scanner(System.in);
        original = sc.nextLine();
        int len = original.length();
        for(int i=len-1;i>=0;i--)
            reverse+= original.charAt(i);
        if(original.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
