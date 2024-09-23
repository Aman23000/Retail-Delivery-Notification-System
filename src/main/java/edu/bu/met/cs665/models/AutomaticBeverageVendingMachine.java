/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/23/2024
 * File Name: Main.java
 * Description: This class used for running the application
 */

package edu.bu.met.cs665.models;
//import java.math.BigDecimal;
/**
 * This is the AutomaticBeverageVendingMachine class.
 * This class has methods which useed for:
 * 	- making beverages / drink
 *  - adding condiments to a given beverage
 *  - calculating the cost of a given beverage
 */
public class AutomaticBeverageVendingMachine {

    private double sugarPrice = 0.50;
    private double milkPrice = 0.25;
    /**
     Constructor
     */
    public AutomaticBeverageVendingMachine(){
    }
    /**
     * Method for creating new beverage objects.
     * @param beverage - user input beverage name
     * @return beverage object matching user input.
     */
    public Beverage brew (String beverage) {
        Beverage drink = null;
        if (beverage.equals("Americano")) {
            drink = new Americano();
        }
        else if (beverage.equals("Black Tea")) {
            drink = new BlackTea();
        }
        else if (beverage.equals("Yellow Tea")) {
            drink = new YellowTea();
        }
        else if (beverage.equals("Green Tea")) {
            drink = new GreenTea();
        }
        else if (beverage.equals("Espresso")) {
            drink = new Espresso();
        }
        else if (beverage.equals("Latte Macchiato")) {
            drink = new LatteMacchiato();
        }

        return drink;
    }
    /**
     * Method for adding condiments to user's beverage.
     * @param beverage - beverage to be modified with condiments
     * @param condiment - can be either sugar or milk, maximum of 3 units
     * @param qty - units for selected condiment to be added to beverage
     * @return modified beverage with specified condiments
     */
    public Beverage addCondiment (Beverage beverage, String condiment, int qty) {
        if (qty > 3) {
            throw new IllegalArgumentException("Condiment quantity cannot exceed 3 units");
        }
        if (qty < 0) {
            throw new IllegalArgumentException("Condiment quantity cannot be negative");
        }
        if (condiment.equals("Milk")) {
            beverage.addMilk(qty);
        }
        else if (condiment.equals("Sugar")) {
            beverage.addSugar(qty);
        }
        return beverage;
    }
    /**
     * Method to for getting cost of a beverage based on type of beverage and condiments added.
     * @param beverage - beverage from by the user
     * @return cost of the given beverage
     */
    public double calculateCostOfBeverage (Beverage beverage) {

        double costOfBeverage = 0;
        costOfBeverage = costOfBeverage + ( milkPrice * beverage.getMilk());
        costOfBeverage = costOfBeverage + (sugarPrice * beverage.getSugar());
        costOfBeverage = costOfBeverage + beverage.getCost();
        return costOfBeverage;
    }

}
