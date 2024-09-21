package Sept.ex_16092024;
import java.util.Scanner;
public class Lab010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            for(int j=0;j<n;j++){
                res += ((int)Math.pow(2,j))*b;
                System.out.print(res+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
