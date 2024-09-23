package Sept.ex_20092024;

public class Lab018_Triangle {
    public static void main(String[] args) {
        int side1=10;
        int side2=30;
        int side3=10;
        if (side1==side2 && side2==side3)
            System.out.print("Equilateral Triangle");
        else if (side1==side2 || side2==side3 || side3==side1)
            System.out.print("Isosceles Triangle");
        else
            System.out.print("Scalene Triangle");
        }
}
