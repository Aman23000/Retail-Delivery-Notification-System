/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/23/2024
 * File Name: Main.java
 * Description: This class is used for testing the application
 */
package edu.bu.met.cs665.Models;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import edu.bu.met.cs665.models.AutomaticBeverageVendingMachine;
import edu.bu.met.cs665.models.Espresso;
import edu.bu.met.cs665.models.Americano;
import edu.bu.met.cs665.models.Beverage;
import edu.bu.met.cs665.models.GreenTea;
import edu.bu.met.cs665.models.YellowTea;

/**
 * This is a test class for the AutomatedBeverageMachine class.
 * This class is Testing following methods:
 *  - brew method
 *  - addCondiment method
 *  - calculateCostOfBeverage method
 */
public class AutomaticBeverageVendingMachineTest {
    AutomaticBeverageVendingMachine beverageMachine;

    @Before
    public void setUp() throws Exception {
        beverageMachine = new AutomaticBeverageVendingMachine();
    }

    @Test
    public void testDrink_Espresso_Success() {
        // Given: an Espresso object
        Beverage expectedBeverage = new Espresso();
        Beverage actualBeverage = beverageMachine.brew("Espresso");
        assertEquals(expectedBeverage.getName(), actualBeverage.getName());
    }

    @Test
    public void testDrink_Americano_Success() {
        // Given: an Americano object
        Beverage expectedBeverage = new Americano();
        // When: the beverage machine brews an Americano object
        Beverage actualBeverage = beverageMachine.brew("Americano");
        // Then: confirm the expected beverage matches the beverage brewed by the beverage machine
        assertEquals(expectedBeverage.getName(), actualBeverage.getName());
    }

    @Test
    public void testBrew_GreenTea_Success() {
        // Given: a GreenTea object
        Beverage expectedBeverage = new GreenTea();
        // When: the beverage machine brews a Green Tea object
        Beverage actualBeverage = beverageMachine.brew("Green Tea");
        // Then: confirm the expected beverage matches the beverage brewed by the beverage machine
        assertEquals(expectedBeverage.getName(), actualBeverage.getName());
    }
    @Test
    public void testBrew_YellowTea_Success() {
        // Given: a YellowTea object
        Beverage expectedBeverage = new YellowTea();
        // When: the beverage machine brews a Yellow Tea object
        Beverage actualBeverage = beverageMachine.brew("Yellow Tea");
        // Then: confirm the expected beverage matches the beverage brewed by the beverage machine
        assertEquals(expectedBeverage.getName(), actualBeverage.getName());
    }

    @Test
    public void testAddCondiment_Milk_Success() {
        // Given: an Americano object adding 3 units of milk
        Beverage expectedBeverage = new Americano();
        expectedBeverage.setMilk(3);

        // When: Adding condiments using the beverage machine, as specified by the user
        Beverage condimentBeverage = new Americano();
        Beverage actualBeverage = beverageMachine.addCondiment(condimentBeverage, "Milk", 3);

        // Then: confirm that both beverages have the same quantity of milk
        assertEquals(expectedBeverage.getMilk(), actualBeverage.getMilk());
    }

    // Failure test for adding different condiment beverages
    @Test
    public void testAddCondiment_Milk_Failure() {
        // Given: a test Americano object with no condiments added
        Beverage testBeverage = new Americano();
        // When: the specified unit of milk exceeds the limit of 3
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            beverageMachine.addCondiment(testBeverage, "Milk", 5);
        });
        // Then: verify that the thrown exception message matches the expected error
        assertEquals("Condiment quantity cannot exceed 3 units", ex.getMessage());
    }
}
