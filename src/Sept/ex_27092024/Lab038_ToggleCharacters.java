package Sept.ex_27092024;

import java.util.Scanner;

//ayUsHi-->AYuShI

public class Lab038_ToggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        String temp="";
        int len = str.length();
        for(int i=0;i<len;i++){
            char c = str.charAt(i);
            if(Character.isLowerCase(c))
                temp+=Character.toUpperCase(c);
            else
                temp+=Character.toLowerCase(c);
        }
        System.out.println(temp);
    }
}
