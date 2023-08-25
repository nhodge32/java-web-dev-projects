package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";

        System.out.println("Please enter a term to search for: ");
        String term = input.next();
        term = term.toLowerCase();
        System.out.println(term);

        boolean matchTerm = firstSentence.toLowerCase().contains(term);
        System.out.println(matchTerm);
        boolean matchTermToo = firstSentence.contains(term);
        System.out.println(matchTermToo);

        if(matchTerm) {
            System.out.println("The term " + term + " was found!");
        } else {
            System.out.println("The term " + term + " was not found.");
        }

        int index = firstSentence.indexOf(term);
        int length = term.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(term, "");
        System.out.println(modifiedSentence);
    }
}
