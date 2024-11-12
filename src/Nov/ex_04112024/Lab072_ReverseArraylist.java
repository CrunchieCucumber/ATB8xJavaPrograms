package Nov.ex_04112024;

import java.util.ArrayList;
import java.util.Collections;

public class Lab072_ReverseArraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list: " +list);

        //Using Collections.reverse
        Collections.reverse(list);
        System.out.println("Reversed list1: " +list);

        //Using a loop
        ArrayList<Integer> reversedlist = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            reversedlist.add(list.get(i));
        }
        System.out.println("Reversed list2: " +reversedlist);

    }
}
