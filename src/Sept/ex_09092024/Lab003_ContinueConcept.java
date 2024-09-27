package Sept.ex_09092024;

//Prints even and odd numbers

public class Lab003_ContinueConcept {
    public static void main(String[] args) {
        for (int i=0;i<=50;i++){
            if (i%2==0){
                System.out.println("Even - "+i);
                continue;
            }
            System.out.println(i);
        }

    }

}
