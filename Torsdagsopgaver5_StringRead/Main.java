import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    static Scanner scan;
    static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine()) {  // checks if there are more lines in the file
            inputFromFile += scan.nextLine();  // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");  // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");
        printWordsOfLength(3);
        printLongestWord();
        printWordsWithLessThanTwoVocals();
        //printFirstHalfOfEachWord();
        printMostFrequentLetter();
        printLessFrequentLetter();
    }

    private static void printWordsOfLength(int l) {
        boolean wordIsValid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordIsValid = false;
                }

                if (wordIsValid) {
                    System.out.println("This word has 3 or less characters: " + s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) { // for each word in text
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println("This word starts with ø: " + s);
            }
        }
    }

    private static void printLongestWord() {
        String longestWord = "";
        int counter = 0;

        for(String s : text) {
            if(s.length() > counter) {
                counter = s.length();
                longestWord = s;
            }
        }
        System.out.println("This is the longest word in the data file: " + longestWord);
    }


    private static void printWordsWithLessThanTwoVocals() {
        int vocalsCounter = 0;

        for (String t : text) {
            for (int i = 0; i < t.length(); i++) {
                char chars = t.charAt(i);
                if (chars == 'a' || chars == 'e' || chars == 'i' || chars == 'o' || chars == 'y' || chars == 'æ' || chars == 'ø' || chars == 'å') {
                    vocalsCounter++;
                    // to show that it checks for vocals in the strings
                    // System.out.println("This is my vocalsCounter: " + vocalsCounter)
                }
            }

            if (vocalsCounter < 2) {
                System.out.println("Less than two vocals in this word: " + t);
                vocalsCounter = 0;
            }
        }
    }

    /*private static void printFirstHalfOfEachWord() {
        String substring = "";

        for (String s : text) { // for each word in text
            // prints the substring after index  till index 17
            substring = substring.length(s);
            System.out.println("substring = " + substring);
        }
    }*/

    private static void printMostFrequentLetter() {
        int mostFrequent;
        int mostFrequentCount;

        // sort the array in alphabetical order
        for (String s : text) {
            sort(text);
            System.out.println("this is the text sorted: " + s);


            if () {

            }


        }
    }

    private static void printLessFrequentLetter() {

    }


}



