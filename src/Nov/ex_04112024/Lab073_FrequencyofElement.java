package Nov.ex_04112024;

import java.util.HashMap;
import java.util.Map;

public class Lab073_FrequencyofElement {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,4,4,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int element:array){
            map.put(element,map.getOrDefault(element,0)+1);
        }
        System.out.println("Frequency of each element:");
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println("Element " +entry.getKey() + ": "+ entry.getValue() + " times");
        }
    }
}
