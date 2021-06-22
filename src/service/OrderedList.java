/**
 * ****************************************************************************
 * Purpose: This class implements Ordered list
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package service;

import java.io.IOException;
import java.util.LinkedList;
import static utility.Utility.fileReader;

public class OrderedList {

    private static LinkedList<String> list = new LinkedList<String>();

    /**
     * This is the main method or starting point of program.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        String[] dataArray = fileReader("C:/Users/Naziya/IdeaProjects/DataStructureProblems/files/NumberList");
        for (String temp : dataArray) {
            list.add(temp);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}


