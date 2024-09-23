package Sept.ex_20092024;

//    *
//   ***
//  *****
// *******
//*********

public class Lab024_Pattern3 {
    public static void main(String[] args) {
        int count=4;
        for(int i=1;i<10;i+=2){
            for(int k=count;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
            count--;
        }
    }
}
