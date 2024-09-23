/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/23/2024
 * File Name: Main.java
 * Description: This class used for running the application
 */

package edu.bu.met.cs665.models;

/**
 * This is Beverage class abstract class.
 * This class is used to represent all the beverages.
 */
public abstract class Beverage {
    private int milk;
    private int sugar;
    private double cost; // Usage of BigDecimal, provides support for specifying precision
    private String name;

    /**
     * Beverage object by setting the name for the beverage.
     *
     * @param name - name of the beverage as string
     */
    public Beverage(String name) {
        this.name = name;
    }

    /**
     * Beverage object by setting the name and cost of the beverage.
     *
     * @param name - name of the beverage as string
     * @param cost - cost of the beverage as BigDecimal
     */
    public Beverage(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Method to add specified units of milk to a beverage.
     *
     * @param qty - units of milk added
     */
    public void addMilk(int qty) {
        this.milk += qty;
    }

    /**
     * Method to add specified units of sugar to a beverage.
     *
     * @param qty - units of sugar added
     */
    public void addSugar(int qty) {
        this.sugar += qty;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[milk=" + milk + ", sugar=" + sugar + ", cost=" + cost + ", name=" + name + "]";
    }
}
