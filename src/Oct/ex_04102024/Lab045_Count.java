package Oct.ex_04102024;

//To count Letters, spaces, numbers and other characters in a string
//Sushi ?123
//Letters=5, Spaces=1, Numbers=3, other=1

import java.util.Scanner;

public class Lab045_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int number=0, letter=0, space=0, other=0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)) number++;
            else if (Character.isLetter(c)) letter++;
            else if (Character.isSpaceChar(c)) space++;
            else other++;
            }

        System.out.println("Number: " +number);
        System.out.println("Letter: " +letter);
        System.out.println("Space: " +space);
        System.out.println("Other: " +other);
       }
}
