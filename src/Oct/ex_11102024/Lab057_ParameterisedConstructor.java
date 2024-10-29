package Oct.ex_11102024;

public class Lab057_ParameterisedConstructor {

    String name,color;

    Lab057_ParameterisedConstructor(String name,String color){
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Lab057_ParameterisedConstructor dog = new Lab057_ParameterisedConstructor("Muffin","Beige");
        System.out.println("Name: " + dog.name);
        System.out.println("Color: " + dog.color);

    }
}
