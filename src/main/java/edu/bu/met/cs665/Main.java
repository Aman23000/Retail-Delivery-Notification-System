/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/23/2024
 * File Name: Main.java
 * Description: This class is used for running the application.
 */
package edu.bu.met.cs665;
import edu.bu.met.cs665.models.AutomaticBeverageVendingMachine;
import edu.bu.met.cs665.models.Beverage;
/**
 * This is the Main class.
 */
public class Main {
  /**
   * A main method to run examples.
   */
  public static void main(String[] args) {
    // Testing main methods created for this project.
    AutomaticBeverageVendingMachine beverageMachine = new AutomaticBeverageVendingMachine();
    Beverage beverage = beverageMachine.brew("Latte Macchiato");
    beverage = beverageMachine.addCondiment(beverage, "Milk", 3);
    System.out.println("Beverage Info: " + beverage.toString());
    System.out.println("Beverage Cost: $" + beverageMachine.calculateCostOfBeverage(beverage));
  }
}
