package Oct.ex_09102024;

//Write a Java program to extract the first half of a even string.
//Test Data: Banana
//Sample Output:
//
//Ban

public class Lab054_FirstHalf {
    public static void main(String[] args) {
        String s = "Banana",halfS="";
        int half = s.length()/2;
        int i=0;

        while(i<half){
            halfS+=s.charAt(i);
            i++;
        }

        //This is also a logic:
        //String halfS = s.substring(0, s.length() / 2);

        System.out.println(halfS);
    }
}
