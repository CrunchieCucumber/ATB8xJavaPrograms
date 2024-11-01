package Oct.ex_14102024;

public class PrintMyBook extends Book {

    public PrintMyBook(String name,String author,Double price){
        super.name = name;
        super.author = author;
        super.price = price;

    }
    @Override
    void getdetails() {
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
