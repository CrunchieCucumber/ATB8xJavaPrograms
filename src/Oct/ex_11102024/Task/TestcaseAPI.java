package Oct.ex_11102024.Task;

public class TestcaseAPI extends BasetestAPI {

    TestcaseAPI(){
        super();
        System.out.println("TestcaseAPI is Calling Parent BasetestAPI");
    }

    @Override
    public void performGET(){
        System.out.println("TestcaseAPI: Performing GET operation");
    }

    @Override
    public void performPOST(){
        System.out.println("TestcaseAPI: Performing POST operation");
    }

    @Override
    public void performPUT(){
        System.out.println("TestcaseAPI: Performing PUT operation");
    }

    @Override
    public void performPATCH(){
        System.out.println("TestcaseAPI: Performing PATCH operation");
    }

    @Override
    public void performDELETE(){
        System.out.println("TestcaseAPI: Performing DELETE operation");
    }
}
