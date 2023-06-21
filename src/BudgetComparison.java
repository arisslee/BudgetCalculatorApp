/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Lee Xiao Qi B210001A
 */

import java.text.DecimalFormat;

public class BudgetComparison {
    private DecimalFormat decimalFormat;

    public BudgetComparison() {
        decimalFormat = new DecimalFormat("#0.00");
    }

    public void displayBudgetComparison(UserInput userInput, double totalWantsAndNeeds, double suggestedExpense, String userCategory) {
        System.out.println("=============================================");
        System.out.println("Budget Comparison for " + userInput.getName());
        System.out.println("=============================================");
        System.out.println("User Category: " + userCategory);
        System.out.println("=============================================");
        System.out.println("Budget Allocation:");
        System.out.println("Short-term Savings: RM" + decimalFormat.format(userInput.calculateShortTermSavings()));
        System.out.println("Medium-term Savings: RM" + decimalFormat.format(userInput.calculateMediumTermSavings()));
        System.out.println("Long-term Savings: RM" + decimalFormat.format(userInput.calculateLongTermSavings()));
        System.out.println("Wants: RM" + decimalFormat.format(userInput.calculateWants()));
        System.out.println("Needs: RM" + decimalFormat.format(userInput.calculateNeeds()));
        System.out.println("=============================================");
        System.out.println("Total wants and needs: RM" + decimalFormat.format(totalWantsAndNeeds));
        if (!userCategory.equals("Unknown")) {
            System.out.println("Suggested expense based on category: RM" + decimalFormat.format(suggestedExpense));
            if (totalWantsAndNeeds <= suggestedExpense) {
                System.out.println("Your budget is within the suggested expense.");
            } else {
                System.out.println("You have exceeded your budget.");
            }
        } else {
            System.out.println("No suggested expense available for unknown category.");
        }
        System.out.println("=============================================");
    }
}
