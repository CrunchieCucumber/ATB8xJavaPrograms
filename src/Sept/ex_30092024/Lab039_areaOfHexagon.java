package Sept.ex_30092024;

//Area = (6*s^2)/4*tan(pi/6)

import java.util.Scanner;

public class Lab039_areaOfHexagon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of a side of hexagon: ");
        double side = sc.nextDouble();
        double area = (6*side*side)/(4*Math.tan(Math.PI/6));
        System.out.println("The area of hexagon is " +area);
    }
}
