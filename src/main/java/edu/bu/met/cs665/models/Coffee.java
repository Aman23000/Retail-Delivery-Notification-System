/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/23/2024
 * File Name: Coffee.java
 * Description: This class extends from Beverage, where the cost of the Beverage is declared
 */
package edu.bu.met.cs665.models;

public abstract class Coffee extends Beverage {
    public Coffee(String name) {
        super(name, 2.0);
    }
}
