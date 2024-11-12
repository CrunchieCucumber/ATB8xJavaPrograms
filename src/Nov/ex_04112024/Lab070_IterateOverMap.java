package Nov.ex_04112024;

import java.util.HashMap;
import java.util.Map;

public class Lab070_IterateOverMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(26,"Z");

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("When Key is " +entry.getKey()+ ", " + "Value is " +entry.getValue());
        }
    }
}
