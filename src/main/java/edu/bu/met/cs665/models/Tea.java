/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/23/2024
 * File Name: Tea.java
 * Description: This class extends from Beverage, where the cost of the Beverage is declared
 */

package edu.bu.met.cs665.models;

public abstract class Tea extends Beverage {
    public Tea(String name) {
        super(name, 1.5);
    }
}
