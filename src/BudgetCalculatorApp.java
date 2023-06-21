/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Lee Xiao Qi B210001A
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class BudgetCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int age = 0;
        while (age < 18 || age > 100) {
            try {
                System.out.print("Enter your age (18-100): ");
                age = scanner.nextInt();
                if (age < 18 || age > 100) {
                    System.out.println("Invalid age. Please enter a valid age (18-100).");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid age. Please enter a valid age.");
            }
        }

        scanner.nextLine();

        String maritalStatus = "";
        while (!maritalStatus.equalsIgnoreCase("1") && !maritalStatus.equalsIgnoreCase("2")) {
            try {
                System.out.print("Enter your marital status (1 for single, 2 for married): ");
                maritalStatus = scanner.nextLine();
                if (!maritalStatus.equalsIgnoreCase("1") && !maritalStatus.equalsIgnoreCase("2")) {
                    System.out.println("Invalid input. Please enter 1 for single or 2 for married.");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid input. Please enter 1 for single or 2 for married.");
            }
        }

        int numberOfChildren = -1;
        while (numberOfChildren < 0 || numberOfChildren > 2) {
            try {
                System.out.print("Enter your number of children (0-2): ");
                numberOfChildren = scanner.nextInt();
                if (numberOfChildren < 0 || numberOfChildren > 2) {
                    System.out.println("Invalid input. Please enter a valid number of children (0-2).");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid input. Please enter a valid number of children.");
            }
        }

        scanner.nextLine();

        String carOwnershipStatus = "";
        while (!carOwnershipStatus.equalsIgnoreCase("1") && !carOwnershipStatus.equalsIgnoreCase("2")) {
            try {
                System.out.print("Enter your car ownership status (1 for car owner, 2 for public transport user): ");
                carOwnershipStatus = scanner.nextLine();
                if (!carOwnershipStatus.equalsIgnoreCase("1") && !carOwnershipStatus.equalsIgnoreCase("2")) {
                    System.out.println("Invalid input. Please enter 1 for car owner or 2 for public transport user.");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid input. Please enter 1 for car owner or 2 for public transport user.");
            }
        }

        double monthlyIncome = 0;
        while (monthlyIncome <= 0) {
            try {
                System.out.print("Enter your monthly income: RM");
                monthlyIncome = scanner.nextDouble();
                if (monthlyIncome <= 0) {
                    System.out.println("Invalid input. Please enter a valid monthly income.");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid input. Please enter a valid monthly income.");
            }
        }

        UserInput userInput = new UserInput(name, age, maritalStatus, numberOfChildren, carOwnershipStatus, monthlyIncome);

        ExpenseTable expenseTable = new ExpenseTable();
        expenseTable.displayExpenseTable();

        String userCategory = expenseTable.getUserCategory(userInput);
        double suggestedExpense = expenseTable.getSuggestedExpense(userCategory);

        double totalWantsAndNeeds = userInput.calculateTotalWantsAndNeeds();

        BudgetComparison budgetComparison = new BudgetComparison();
        budgetComparison.displayBudgetComparison(userInput, totalWantsAndNeeds, suggestedExpense, userCategory);
    }
}
