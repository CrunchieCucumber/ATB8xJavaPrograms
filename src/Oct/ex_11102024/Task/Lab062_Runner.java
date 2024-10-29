package Oct.ex_11102024.Task;

public class Lab062_Runner {
    public static void main(String[] args) {
        BasetestAPI obj1 = new BasetestAPI();
        BasetestAPI obj2 = new TestcaseAPI(); //dynamic dispatch
        //TestcaseAPI obj3 = new BasetestAPI(); -->Invalid

        obj2.performGET();
        obj2.performPUT();
        obj2.performPOST();
        obj2.performPATCH();
        obj2.performDELETE();

        obj1.performGET();
        obj1.performPUT();
        obj1.performPOST();
        obj1.performPATCH();
        obj1.performDELETE();

        obj2.setId(14);
        obj2.setName("Ayushi");
        System.out.println("Id is " + obj2.getId());
        System.out.println("Name is " + obj2.getName());

        obj1.setId(0);
        obj1.setName("Prankur");
        System.out.println("Id is " + obj1.getId());
        System.out.println("Name is " + obj1.getName());
    }
}
