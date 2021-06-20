/**
 * ****************************************************************************
 * Purpose: This Utility class is containing a number of methods which can be
 * called from the main. This class contains methods that perform
 * common, often reused functions.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package utility;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Utility {

    static Scanner scan = new Scanner(System.in);

    /**
     * This method is used to get string as input and return it.
     *
     * @return Input String
     */
    public static String inputString() {

        try {
            return scan.next();
        } catch (Exception e) {
            scan.nextLine();
            System.out.println("Invalid input, try again.");
            return inputString();
        }
    }

    /**
     * This method is used to show the Arithmetic Expression which is
     * taken as input is balanced or not.
     *
     * @param exp is the Arithmetic Expression which is input from the user
     */
    public static void BalanceParantheses(String exp) {
        Stack s = new Stack();
        char e[] = exp.toCharArray();
        int explength = exp.length();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < explength; i++) {
            if (e[i] == '(') {
                s.push(e[i]);
                count1++;
            } else if (e[i] == ')') {
                s.pop();
                count2++;
            }
        }
        if (count1 == count2) {
            System.out.println("Expression is Balanced");
        } else {
            System.out.println("Expression is not Balanced");
        }
    }

    /**
     * This method is used to get integer as input and return it.
     *
     * @return Input integer
     */
    public static int inputInt() {
        try {
            return scan.nextInt();
        } catch (Exception e) {
            scan.nextLine();
            System.out.println("Invalid input, try again.");
            return inputInt();
        }
    }


    /**
     * This method is used to display the Calender of the month.
     *
     * @param month is input from user
     * @param year  is input from user
     */
    public static void Calendar(int month, int year) {

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((month == 2) && (isLeapOrNot(year))) {
            days[month] = 29;
        }

        System.out.println("   " + months[month - 1] + " " + year);
        System.out.println(" S  M  T  W  Th  F  St");
        int d = dayOfWeek(month, 1, year);

        for (int i = 0; i < d; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month - 1]))
                System.out.println();
        }
    }


    /**
     * This method is used to find the day of the week.
     *
     * @param m is the month
     * @param d is the day
     * @param y is the year
     * @return day of the week
     */
    public static int dayOfWeek(int m, int d, int y) {
        int y1 = y - (14 - m) / 12;
        int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
        int m1 = m + 12 * ((14 - m) / 12) - 2;
        int d1 = (d + x + 31 * m1 / 12) % 7;
        return d1;
    }


    /**
     * This method is used to check if entered year is a leap year or not
     *
     * @param year is taken to check leap year or not
     * @return leap year or not
     */
    public static boolean isLeapOrNot(int year) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println("Is a Leap Year");
            return true;
        } else {
            System.out.println("Is not a Leap Year");
            return false;
        }
    }

    /**
     * This method used to show if the String is palindrome or not.
     * It uses dequeue to store characters of string and checks.
     *
     * @param lowerString as input from user
     */
    public static void palindromeChecker(String lowerString) {

        ArrayDeque<Character> arrayDeque = new ArrayDeque<Character>();

        for (int i = lowerString.length() - 1; i >= 0; i--) {
            // add method to add elements
            arrayDeque.add(lowerString.charAt(i));
        }
        String reverseString = "";
        while (!arrayDeque.isEmpty()) {
            reverseString = reverseString + arrayDeque.remove();
        }
        if (lowerString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }

}
