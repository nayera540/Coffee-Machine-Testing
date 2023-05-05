import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to test the CoffeeMachine using bottom-up approach integration testing
 */

class CoffeeMachineTest {

    private ByteArrayInputStream bais;


    //To test the constructor
    @Test
    void coffeeMachine() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();



        assertEquals(coffeeMachine.getCoffee_Count(),0);
        assertEquals(coffeeMachine.getWater(),0);
        assertEquals(coffeeMachine.getMilk(),0);
        assertEquals(coffeeMachine.getCoffee_powder(),0);
    }
    @Test
    void setIngredientTest() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.SetIngredient();

        assertEquals(coffeeMachine.getCoffee_Count(),0);
        assertEquals(coffeeMachine.getWater(),2);
        assertEquals(coffeeMachine.getMilk(),1);
        assertEquals(coffeeMachine.getCoffee_powder(),500.0);
    }


    @Test
    void cleanMachine() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.CleanMachine();

        assertEquals(coffeeMachine.getCoffee_Count(),0);
        assertEquals(coffeeMachine.getWater(),0);
        assertEquals(coffeeMachine.getMilk(),0);
        assertEquals(coffeeMachine.getCoffee_powder(),0);
    }



    @Test
    void blackCoffee() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.SetIngredient();
        coffeeMachine.BlackCoffee();

        assertEquals(coffeeMachine.getCoffee_Count(),1);
        assertEquals(coffeeMachine.getWater(),1.8);
        assertEquals(coffeeMachine.getMilk(),1);
        assertEquals(coffeeMachine.getCoffee_powder(),490);
    }
    @Test
    void blackCoffee2() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.BlackCoffee();

        assertEquals(coffeeMachine.getCoffee_Count(),0);
        assertEquals(coffeeMachine.getWater(),0);
        assertEquals(coffeeMachine.getMilk(),0);
        assertEquals(coffeeMachine.getCoffee_powder(),0);
    }

    @Test
    void milkCoffee() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.SetIngredient();
        coffeeMachine.MilkCoffee();

        assertEquals(coffeeMachine.getCoffee_Count(),1);
        assertEquals(coffeeMachine.getWater(),1.8);
        assertEquals(coffeeMachine.getMilk(),0.6);
        assertEquals(coffeeMachine.getCoffee_powder(),490);
    }
    @Test
    void milkCoffee2() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.MilkCoffee();

        assertEquals(coffeeMachine.getCoffee_Count(),0);
        assertEquals(coffeeMachine.getWater(),0);
        assertEquals(coffeeMachine.getMilk(),0);
        assertEquals(coffeeMachine.getCoffee_powder(),0);
    }
    @Test
    void milkCoffee3() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.SetIngredient();
        coffeeMachine.MilkCoffee();
        coffeeMachine.MilkCoffee();

        assertEquals(coffeeMachine.getCoffee_Count(),2);
        assertEquals(coffeeMachine.getWater(),1.6);
        assertEquals(coffeeMachine.getMilk(),0.19999999999999996);
        assertEquals(coffeeMachine.getCoffee_powder(),480);
    }

    @Test
    void makecoffee() {
        String userInput = "1";
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.scan = new Scanner(System.in);

        coffeeMachine.SetIngredient();
        coffeeMachine.makecoffee();

        assertEquals(coffeeMachine.getCoffee_Count(),1);
        assertEquals(coffeeMachine.getWater(),1.8);
        assertEquals(coffeeMachine.getMilk(),1);
        assertEquals(coffeeMachine.getCoffee_powder(),490);

    }
    @Test
    void makecoffee2() {
        String userInput = String.format("1%s1", System. lineSeparator(), System. lineSeparator());
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.scan = new Scanner(System.in);

        coffeeMachine.SetIngredient();
        coffeeMachine.makecoffee();
        coffeeMachine.makecoffee();

        assertEquals(coffeeMachine.getCoffee_Count(),2);
        assertEquals(coffeeMachine.getWater(),1.6);
        assertEquals(coffeeMachine.getMilk(),1);
        assertEquals(coffeeMachine.getCoffee_powder(),480);

    }
    @Test
    void makecoffee3() {
        String userInput = "2";
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.scan = new Scanner(System.in);

        coffeeMachine.SetIngredient();
        coffeeMachine.makecoffee();

        assertEquals(coffeeMachine.getCoffee_Count(),1);
        assertEquals(coffeeMachine.getWater(),1.8);
        assertEquals(coffeeMachine.getMilk(),0.6);
        assertEquals(coffeeMachine.getCoffee_powder(),490);

    }
    @Test
    void makecoffee4() {
        String userInput = String.format("2%s2", System. lineSeparator(), System. lineSeparator());
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.scan = new Scanner(System.in);

        coffeeMachine.SetIngredient();
        coffeeMachine.makecoffee();
        coffeeMachine.makecoffee();

        assertEquals(coffeeMachine.getCoffee_Count(),2);
        assertEquals(coffeeMachine.getWater(),1.6);
        assertEquals(coffeeMachine.getMilk(),0.19999999999999996);
        assertEquals(coffeeMachine.getCoffee_powder(),480);

    }
    @Test
    void makecoffee5() {
        String userInput = "0";
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.scan = new Scanner(System.in);

        coffeeMachine.SetIngredient();
        coffeeMachine.makecoffee();


        assertEquals(coffeeMachine.getCoffee_Count(),0);
        assertEquals(coffeeMachine.getWater(),2);
        assertEquals(coffeeMachine.getMilk(),1);
        assertEquals(coffeeMachine.getCoffee_powder(),500.0);

    }

    @Test
    void start() {
        String userInput = String.format("2%s6", System. lineSeparator(), System. lineSeparator());
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.scan = new Scanner(System.in);

        coffeeMachine.start();


        assertEquals(coffeeMachine.getCoffee_Count(),0);
        assertEquals(coffeeMachine.getWater(),2);
        assertEquals(coffeeMachine.getMilk(),1);
        assertEquals(coffeeMachine.getCoffee_powder(),500.0);
    }
    @Test
    void start2() {
        String userInput = String.format("2%s3%s6", System. lineSeparator(), System. lineSeparator());
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.scan = new Scanner(System.in);

        coffeeMachine.start();


        assertEquals(coffeeMachine.getCoffee_Count(),0);
        assertEquals(coffeeMachine.getWater(),0);
        assertEquals(coffeeMachine.getMilk(),0);
        assertEquals(coffeeMachine.getCoffee_powder(),0);
    }
    @Test
    void start3() {
        String userInput = String.format("2\n4\n1\n6", System. lineSeparator(), System. lineSeparator());
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.scan = new Scanner(System.in);

        coffeeMachine.start();


        assertEquals(coffeeMachine.getCoffee_Count(),1);
        assertEquals(coffeeMachine.getWater(),1.8);
        assertEquals(coffeeMachine.getMilk(),1);
        assertEquals(coffeeMachine.getCoffee_powder(),490);
    }
    @Test
    void start4() {
        String userInput = String.format("2\n4\n2\n6", System. lineSeparator(), System. lineSeparator());
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.scan = new Scanner(System.in);

        coffeeMachine.start();


        assertEquals(coffeeMachine.getCoffee_Count(),1);
        assertEquals(coffeeMachine.getWater(),1.8);
        assertEquals(coffeeMachine.getMilk(),0.6);
        assertEquals(coffeeMachine.getCoffee_powder(),490);
    }
}