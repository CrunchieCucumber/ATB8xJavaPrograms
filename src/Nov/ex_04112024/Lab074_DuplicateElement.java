package Nov.ex_04112024;

import java.util.HashSet;

public class Lab074_DuplicateElement {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,2,5,3,6};
        HashSet<Integer> dupe = new HashSet<>();
        System.out.print("Duplicate Elements: ");
        for(int num:array){
            if(!dupe.add(num)){
                System.out.print(num+ " ");
            }
        }
        System.out.println();
        System.out.print("The non-duplicate set looks like: ");
        System.out.print(dupe);
    }
}
