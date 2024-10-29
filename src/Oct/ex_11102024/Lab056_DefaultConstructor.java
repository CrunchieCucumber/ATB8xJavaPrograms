package Oct.ex_11102024;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Lab056_DefaultConstructor {

        String name;
        int age;

        Lab056_DefaultConstructor() {
            name = "Unknown";
            age = 0;
        }

    public static void main(String[] args) {
        Lab056_DefaultConstructor cat = new Lab056_DefaultConstructor();

        System.out.println("Name: " + cat.name);
        System.out.println("Age: " + cat.age);
    }
}
