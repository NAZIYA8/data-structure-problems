/**
 * ****************************************************************************
 * Purpose: This class is implemented to print the calender of the month.
 * It takes month and year as input.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package service;

import utility.Utility;

public class Calender {

    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter the Month:");
        int month = Utility.inputInt();
        System.out.println("Enter the Year:");
        int year = Utility.inputInt();
        Utility.Calendar(month, year);
    }
}
