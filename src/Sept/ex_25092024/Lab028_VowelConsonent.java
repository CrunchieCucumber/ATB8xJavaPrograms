package Sept.ex_25092024;

public class Lab028_VowelConsonent {
    public static void main(String[] args) {
        String str = "AyUsHi";
        int vcount=0;
        int ccount=0;
        int len=str.length();
        System.out.println(len);
        for (int i=0;i<len;i++){
            char s = str.charAt(i);
            if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u' || s=='A' || s=='E' || s=='I' || s=='O' || s=='U')
                vcount++;
            else
                ccount++;
        }
        System.out.println("Total number of vowels in the string is "+vcount);
        System.out.println("Total number of consonants in the string is "+ccount);

    }
}
