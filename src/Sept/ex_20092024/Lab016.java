package Sept.ex_20092024;

public class Lab016 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=45;
        // (a>b ? a:b)>c ? (a>b ? a:b):c
        int max1=a > b ? a : b;
        int max=max1 > c ? max1 : c;
        System.out.println(max);
    }
}
