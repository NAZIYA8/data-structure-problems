/**
 * ****************************************************************************
 * Purpose: This method used to show if the String is palindrome or not.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package service;

import utility.Utility;

public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("Enter the String:");
        String string = Utility.inputString();
        String lowerString = string.toLowerCase();
        Utility.palindromeChecker(lowerString);

    }
}