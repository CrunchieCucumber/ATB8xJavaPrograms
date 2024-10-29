package Oct.ex_09102024;

//Write a Java program to insert a word in the middle of another string.
//Insert "Tutorial" in the middle of "Java 3.0", so the result will be Python Tutorial 3.0.
//Sample Output:
//
//Java Tutorial 3.0

public class Lab053_InsertWord {
    public static void main(String[] args) {
        String s = "Java 3.0";
        String str = "";

        for(int i=0;i<s.length();i++) {
            str += s.charAt(i);
            if (s.charAt(i) == ' ') {
                str += "Tutorial"+" ";
            }
        }
        System.out.println(str);
    }
}
