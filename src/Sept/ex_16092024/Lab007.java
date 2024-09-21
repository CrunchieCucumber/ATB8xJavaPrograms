package Sept.ex_16092024;

import java.util.Scanner;

public class Lab007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();

        //clear the input buffer
        scan.nextLine(); //consume the remaining newline character

        String s = scan.nextLine();

        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
    }
