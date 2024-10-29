package Oct.ex_11102024.Task;

public class BasetestAPI {
    private String name;
    private int id;

    BasetestAPI(){
        System.out.println("Basetest Default Constructor");
    }

    BasetestAPI(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("Basetest Parameterized Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0) this.id = id;
        else System.out.println("Enter a valid id");
    }

    public void performGET(){
        System.out.println("BasetestAPI: Performing GET operation");
    }

    public void performPOST(){
        System.out.println("BasetestAPI: Performing POST operation");
    }

    public void performPUT(){
        System.out.println("BasetestAPI: Performing PUT operation");
    }

    public void performPATCH(){
        System.out.println("BasetestAPI: Performing PATCH operation");
    }

    public void performDELETE(){
        System.out.println("BasetestAPI: Performing DELETE operation");
    }
}
