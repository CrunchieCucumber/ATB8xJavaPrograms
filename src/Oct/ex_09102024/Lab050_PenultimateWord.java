package Oct.ex_09102024;

//Write a Java program to find the penultimate (next to the last) word in a sentence.
//Sample Output:
//
//Input a String: The quick brown fox jumps over the lazy dog.
//Penultimate word: lazy

import java.util.Scanner;

public class Lab050_PenultimateWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();

        // Split the sentence into words using one or more spaces as the delimiter
        String[] words = s.split("[ ]+");

                // Print the penultimate word from the array
        System.out.println("Penultimate word: " + words[words.length - 2]);
    }
}
