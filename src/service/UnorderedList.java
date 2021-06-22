/**
 * ****************************************************************************
 * Purpose: This class implements UnOrdered list
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class UnorderedList {
    private static LinkedList<String> list = new LinkedList<String>();

    /**
     * This is the main method or starting point of program.
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        String[] dataArray = fileReader("C:/Users/Naziya/IdeaProjects/DataStructureProblems/files/Data");
        for (String temp : dataArray) {
            list.add(temp);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the you want to find : ");
        String userInput = scanner.next();
        editFile(userInput);
        fileWriter(list);

    }

    /**
     * Method to read the text file, Splits each line into words and store the words into array.
     *
     * @param filePath : Name of file or full path of file.
     */
    private static String[] fileReader(String filePath) throws IOException {
        String line;
        String[] wordsArray = new String[0];
        FileReader file = new FileReader(filePath);
        BufferedReader bufferReader = new BufferedReader(file);
        while ((line = bufferReader.readLine()) != null) {
            wordsArray = line.split(" ");
        }
        bufferReader.close();
        return wordsArray;
    }

    /**
     * Method for write the txt file, fetch words from list and write into txt file .
     *
     * @param list : new word stored list
     */
    public static void fileWriter(LinkedList<String> list) throws IOException {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str = str.concat(list.get(i)).concat(" ");
        }
        FileWriter fileWriter = new FileWriter("C:/Users/Naziya/IdeaProjects/DataStructureProblems/files/Data");
        for (int i = 0; i < str.length(); i++) {
            fileWriter.write(str.charAt(i));
        }
        System.out.println("successfully done");
        fileWriter.close();
    }

    /**
     * Method to check if word is present in the list.
     * If present remove from list else store into the list.
     *
     * @param word : string or word queried by user
     */
    private static void editFile(String word) {
        if (list.contains(word)) {
            list.remove(word);
        } else {
            list.add(word);
        }
    }
}
