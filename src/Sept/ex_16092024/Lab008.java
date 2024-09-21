package Sept.ex_16092024;

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int f=1;
        int i=1;
        do{
            f=f*i;
            i+=1;
        }while(i<=num);
        System.out.println(f);

    }
}
