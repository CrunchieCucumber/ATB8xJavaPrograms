package Sept.ex_16092024;

import java.util.Scanner;

public class Lab012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineNumber = 1;

        while(scan.hasNext()){
            String line = scan.nextLine();
            System.out.println(lineNumber +" "+line);
            lineNumber++;
        }
        scan.close();
    }
    }
