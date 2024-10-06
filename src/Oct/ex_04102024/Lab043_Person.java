package Oct.ex_04102024;

public class Lab043_Person {
        String name,gender,email,profession,address;
        Double height,weight;
        int age;
        long phone;

        //Default constructor
        Lab043_Person(){
            System.out.println("I am a default constructor");
        }

        //Parametrized constructor
        Lab043_Person(String name,String gender,String profession,int age) {
            System.out.println("I am a parametrized constructor");
        }

        //Function with arguments and return value
        boolean is_adult(int age){
            //System.out.println("Person is an adult");
            return age > 18;
        }

        //Function with arguments and no return value
        void introduceSelf(String name,String profession,int age){
            System.out.println("My name is " +name);
            System.out.println("I am a " +profession);
            System.out.println("I am " +age+ " years old");
        }

        //Function with no arguments and with return value
        String doesExercise(){
            return "This person does exercise regularly";
        }

        //Function with no arguments and no return value
        void eat(){
            System.out.println("Person eats Indian food");
        }

    }

