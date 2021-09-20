/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpalindromes;

import java.util.ArrayList;

/**
 *
 * @author vicky
 */
public class CheckPalindrome {

    //this method iterates through a list and prints the results
    public static void printList() {
        listOfStrings().forEach(string -> {
            printResult(string);
        });
    }

    //this method creates an ArrayList of strings (words or phrases)
    public static ArrayList<String> listOfStrings() {
        ArrayList<String> testInputs = new ArrayList();
        testInputs.add("Anna");
        testInputs.add("Bob");
        testInputs.add("level");
        testInputs.add("Vicky");
        testInputs.add("tenet");
        testInputs.add("Test");
        testInputs.add("Race Car");
        testInputs.add("Top spot");
        testInputs.add("Never odd or even");
        testInputs.add("Mr Owl ate my metal worm");
        testInputs.add("WoW");
        testInputs.add("success");

        return testInputs;
    }

    //this method cleans the string given from spaces and sets it to lowercase
    //then it checks the equality of the clean string and the reversed one and
    //it prints the results (whether it's a palindrome or not)
    public static void printResult(String text) {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();

        if (cleanText.equals(reverseString(cleanText))) {
            System.out.println("'" + text + "'" + " is a palindrome\n");
        } else {
            System.out.println("'" + text + "'" + " is not a palindrome\n");
        }
    }

    //this method creates a reversed string
    public static String reverseString(String text) {
        String reverse = "";
        int length = text.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
        return reverse;
    }

}
