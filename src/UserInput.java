/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Lee Xiao Qi B210001A
 */

public class UserInput extends Person {
    private String maritalStatus;
    private int numberOfChildren;
    private String carOwnershipStatus;
    private double monthlyIncome;

    public UserInput(String name, int age, String maritalStatus, int numberOfChildren,
                     String carOwnershipStatus, double monthlyIncome) {
        super(name, age);
        this.maritalStatus = maritalStatus;
        this.numberOfChildren = numberOfChildren;
        this.carOwnershipStatus = carOwnershipStatus;
        this.monthlyIncome = monthlyIncome;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public String getCarOwnershipStatus() {
        return carOwnershipStatus;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }
    
    public double calculateShortTermSavings() {
        return getMonthlyIncome() * 0.1;
    }
    
    public double calculateMediumTermSavings() {
        return getMonthlyIncome() * 0.1;
    }
    
    public double calculateLongTermSavings() {
        return getMonthlyIncome() * 0.1;
    }
    
    public double calculateWants() {
        return getMonthlyIncome() * 0.25;
    }
    
    public double calculateNeeds() {
        return getMonthlyIncome() * 0.45;
    }
    
    public double calculateTotalWantsAndNeeds() {
        return calculateWants() + calculateNeeds();
    }
}
