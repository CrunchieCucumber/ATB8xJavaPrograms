package Sept.ex_27092024;

//Pr  og r am-->Program

import java.util.Scanner;

public class Lab036_RemoveWhitespaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        str=str.replaceAll(" ","");
        System.out.println(str);
    }

}
