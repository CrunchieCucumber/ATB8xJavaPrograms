package Oct.ex_04102024;

public class Lab044_PersonCall {
    public static void main(String[] args) {
        Lab043_Person person1 = new Lab043_Person();
        Lab043_Person person2 = new Lab043_Person("Ayushi","female","Test Analyst",26);
        person2.introduceSelf("Prankur","Data Analyst",27);
        person1.eat();
        System.out.println(person1.is_adult(2));
        System.out.println(person2.doesExercise());
    }
}
