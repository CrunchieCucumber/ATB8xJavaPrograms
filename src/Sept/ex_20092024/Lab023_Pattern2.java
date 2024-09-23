package Sept.ex_20092024;

//*****
//****
//***
//**
//*

public class Lab023_Pattern2 {
    public static void main(String[] args) {

        int loop=5;
        do{
            for(int i=0;i<loop;i++){
                System.out.print("*");
            }
            loop--;
            System.out.println();
        }while(loop>0);
    }
}
