package Oct.ex_18102024;

//String "Ayushi" has 6 characters

import java.util.Scanner;

public class Lab064_LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        int length = 0;

        for(char c:input.toCharArray()){
            length++;
        }
        System.out.println("Length of the input string is: "+length);
    }
}
