package Nov.ex_03112024;

//Write a Java program to create a class called "Counter" with a static variable count.
//Implement a constructor that increments count every time an object is created.
//Print the value of count after creating several objects.

public class Lab065_StaticPractice1 {
    private static int count = 0;

    public Lab065_StaticPractice1(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Lab065_StaticPractice1 obj1 = new Lab065_StaticPractice1();
        Lab065_StaticPractice1 obj2 = new Lab065_StaticPractice1();
        Lab065_StaticPractice1 obj3 = new Lab065_StaticPractice1();

        System.out.println("Count is " +Lab065_StaticPractice1.getCount());

    }
}
