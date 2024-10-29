package Oct.ex_04102024;

//Program to create and display a unique three-digit number using 1,2,3,4.
// Also count how many three-digit numbers are there.

public class Lab046_Unique3digitNum {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if(k!=i && k!=j && i!=j){
                        count++;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("Total number of unique 3 digit number is: "+count);
    }
}
