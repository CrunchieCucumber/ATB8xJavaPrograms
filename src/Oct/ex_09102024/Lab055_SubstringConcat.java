package Oct.ex_09102024;

//Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
//Test Data: Str1 = Python
//Str2 = Tutorial
//Sample Output:
//
//ythonutorial

public class Lab055_SubstringConcat {
    public static void main(String[] args) {
        String Str1 = "Python";
        String Str2 = "Tutorial";
        
        System.out.println(Str1.substring(1) + Str2.substring(1));
    }
}
