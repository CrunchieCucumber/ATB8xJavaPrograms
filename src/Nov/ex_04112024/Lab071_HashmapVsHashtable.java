package Nov.ex_04112024;

import java.util.HashMap;
import java.util.Hashtable;

public class Lab071_HashmapVsHashtable {

    //Hashtable is synchronized, meaning it is thread-safe and can be shared between multiple threads
    //without additional synchronization code.
    //HashMap is not synchronized, making it faster but not thread-safe. You can make a HashMap
    //synchronized by using Collections.synchronizedMap(new HashMap<>())

    //Hashtable does not allow any null key or value. Attempting to insert a null key or value
    //will result in a NullPointerException.
    //HashMap allows one null key and multiple null values

    //Hashtable uses an Enumerator for iteration, which is not fail-fast.
    //HashMap uses an Iterator, which is fail-fast and throws a ConcurrentModificationException
    //if the map is modified while iterating

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put(null, "value3"); // Allows null key
        map.put("key4", null);   // Allows null value

        System.out.println("HashMap: " + map);

        Hashtable<String, String> table = new Hashtable<>();
        table.put("key1", "value1");
        table.put("key2", "value2");
        // table.put(null, "value3"); // Throws NullPointerException
        // table.put("key4", null);   // Throws NullPointerException

        System.out.println("Hashtable: " + table);
    }
}
