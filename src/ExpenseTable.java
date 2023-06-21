/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Lee Xiao Qi B210001A
 */

public class ExpenseTable {
    public void displayExpenseTable() {
        System.out.println("=============================================");
        System.out.println("Expenses Budget for Johor Bahru ");
        System.out.println("=============================================");
        System.out.println("1. Single public transport user: RM1760");
        System.out.println("2. Single car owner: RM2290");
        System.out.println("3. Married couple without children: RM4110");
        System.out.println("4. Married couple with one child: RM5360");
        System.out.println("5. Married couple with two children: RM6100");
        System.out.println("6. Senior single: RM2330");
        System.out.println("7. Senior couple: RM3020");
        System.out.println("8. Single parent with one child: RM4200");
        System.out.println("9. Single parent with two children: RM4940");
        System.out.println("=============================================");
    }

    public String getUserCategory(UserInput userInput) {
        int age = userInput.getAge();
        String maritalStatus = userInput.getMaritalStatus();
        int numberOfChildren = userInput.getNumberOfChildren();
        String carOwnershipStatus = userInput.getCarOwnershipStatus();

        if (age >= 18 && age < 60) {
            if (maritalStatus.equalsIgnoreCase("1")) {
                if (numberOfChildren == 0 && carOwnershipStatus.equalsIgnoreCase("2")) {
                    return "Single public transport user";
                } else if (numberOfChildren == 0 && carOwnershipStatus.equalsIgnoreCase("1")) {
                    return "Single car owner";
                } else if (numberOfChildren == 1) {
                    return "Single parent with one child";
                } else if (numberOfChildren == 2) {
                    return "Single parent with two children";
                }
            } else if (maritalStatus.equalsIgnoreCase("2")) {
                if (numberOfChildren == 0) {
                    return "Married couple without children";
                } else if (numberOfChildren == 1) {
                    return "Married couple with one child";
                } else if (numberOfChildren == 2) {
                    return "Married couple with two children";
                }
            }
        } else if (age >= 60) {
            if (maritalStatus.equalsIgnoreCase("1")) {
                return "Senior single";
            } else if (maritalStatus.equalsIgnoreCase("2")) {
                return "Senior couple";
            }
        }

        // Default category if no match is found
        return "Unknown";
    }

    public double getSuggestedExpense(String userCategory) {
        switch (userCategory) {
            case "Single public transport user":
                return 1760;
            case "Single car owner":
                return 2290;
            case "Married couple without children":
                return 4110;
            case "Married couple with one child":
                return 5360;
            case "Married couple with two children":
                return 6100;
            case "Senior single":
                return 2330;
            case "Senior couple":
                return 3020;
            case "Single parent with one child":
                return 4200;
            case "Single parent with two children":
                return 4940;
            default:
                return 0;
        }
    }
}
