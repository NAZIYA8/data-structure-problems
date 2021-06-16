/**
 * ****************************************************************************
 * Purpose: This class is implemented to show the Arithmetic Expression is
 * balanced or not. It takes Arithmetic expression as input where
 * parentheses are used to order the performance of operations.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 15-06-2021
 * ****************************************************************************
 */

package service;

import utility.Utility;

public class BalancedParantheses {

    public static void main(String[] args) {
        try {
            new Utility();
            System.out.println("Enter the Expression:");
            String exp = Utility.inputString();
            Utility.BalanceParantheses(exp);
        } catch (Exception e) {
            System.out.println("The expression is not Balanced");
        }
    }
}