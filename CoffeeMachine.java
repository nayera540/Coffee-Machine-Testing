import java.util.Scanner;

class CoffeeMachine{
    static Scanner scan = new Scanner(System.in);
    private double coffee_powder, milk, water;
    private int Coffee_Count = 0;
    public CoffeeMachine(){ //Default Constructor Initialization...
        this.coffee_powder=0;
        this.milk=0;
        this.water=0;
    }
    public void SetIngredient(){   //Calling for Filling Ingredient...
        System.out.println("\nFilling...");
        this.coffee_powder = 500.0;
        this.milk = 1;
        this.water= 2;
        System.out.println("Filling Completed.");
    }
    public void GetIngredient(){   //To Get Status
        System.out.println("Available Coffee Power(Gram) "+String.format("%.1f",this.coffee_powder));
        System.out.println("Available Milk(Liter) "+String.format("%.1f", this.milk));
        System.out.println("Available Water(Liter) "+String.format("%.1f", this.water));
    }
    public void CleanMachine(){    //Initialization with Null In order to Clean Machine
        System.out.println("\nCleaning Machine...");
        this.coffee_powder = 0;
        this.milk = 0;
        this.water= 0;
        System.out.println("Cleaning Completed.");
    }
    public void makecoffee(){  //Coffee Selection Menu
        System.out.println("\n ------------------ ");
        System.out.println("|   Select Type:   |\n ------------------ \n| 1:  Black Coffee |\n| 2:  Milk Coffee  |\n| 0   to Discard   |");
        System.out.println(" ------------------ \n");
        char t = scan.next().charAt(0);
        switch(t){
            case '1':
                this.BlackCoffee();     //Call to BlackCoffee Method
                break;
            case '2':
                this.MilkCoffee();      //Call to MilkCoffee Method
                break;
            case '0':
                break;
        }
    }
    public void BlackCoffee(){
        if(this.coffee_powder >= 10 && this.water >= 0.2){
            System.out.println("\nMaking Black Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 10;
            System.out.println("Taking 0.2 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("\nYour Black Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nAvailable Coffee Powder(Gram) "+String.format("%.1f",this.coffee_powder));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.water));
            System.out.println("\nSome Items Are Not Available, Please Fill before Making Coffee.");
        }
    }
    public void MilkCoffee(){
        if(this.coffee_powder >= 10 && this.milk >= 0.4 && this.water >= 0.2){
            System.out.println("\nMaking Milk Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 10;
            System.out.println("Taking 0.4 Liter of Milk.");
            this.milk = this.milk - 0.4;
            System.out.println("Taking 0.2 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("\nYour Milk Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nAvailable Coffee Power(Gram) "+String.format("%.1f",this.coffee_powder));
            System.out.println("Available Milk(Liter) "+String.format("%.1f", this.milk));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.water));
            System.out.println("\nSome Items Are Not Available, Please Fill before Making Coffee.");
        }
    }
    public void start(){    //public Start to access all private methods of this class
        System.out.println(" ----------------------------------------------------------------");
        System.out.println("|                   Coffee Machine By Manikant                   |");
        System.out.println(" ----------------------------------------------------------------");
        //System.out.println("Currently We Have The following Operations, Select as your Need:- ");
        System.out.println("\nCurrent Status: ");
        this.GetIngredient();
        boolean t = true;
        while(t){
            System.out.println("\n -------------------------------- ");
            System.out.println("|1:     Status of Ingredient     |\n -------------------------------- \n|2:      Fill Ingredient         |\n -------------------------------- \n|3:       Clean Machine          |\n -------------------------------- \n|4:        Make Coffee           |\n -------------------------------- \n|5: How many Coffee We have made?|\n -------------------------------- \n|6:        Exit                  |");
            System.out.println(" -------------------------------- \n\n");
            char c = CoffeeMachine.scan.next().charAt(0);
            switch(c){
                case '1':
                    System.out.println("------------- Status ------------");
                    this.GetIngredient();
                    System.out.println("---------------------------------");
                    break;
                case '2':
                    this.SetIngredient();
                    break;
                case '3':
                    this.CleanMachine();
                    break;
                case '4':
                    this.makecoffee();
                    break;
                case '5':
                    System.out.println("\nWe Have Made "+this.Coffee_Count+" Coffees.");
                    break;
                case '6':
                    System.out.println("\nExiting...\n");
                    t = false;
                    break;
            }
        }
    }
    public void SetIngredientStub(){
        this.coffee_powder = 500.0;
        this.milk = 1;
        this.water= 2;
    }
    public void CleanMachineStub(){
        this.coffee_powder = 0;
        this.milk = 0;
        this.water= 0;
    }
    public void BlackCoffeeStub(){
        this.coffee_powder = this.coffee_powder - 10;
        this.water = this.water - 0.2;
        this.Coffee_Count++;
    }
    public void MilkCoffeeStub(){
        this.coffee_powder = this.coffee_powder - 10;
        this.milk = this.milk - 0.4;
        this.water = this.water - 0.2;
        this.Coffee_Count++;
    }
    public double getCoffee_powder() {
        return coffee_powder;
    }

    public void setCoffee_powder(double coffee_powder) {
        this.coffee_powder = coffee_powder;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public int getCoffee_Count() {
        return Coffee_Count;
    }

    public void setCoffee_Count(int coffee_Count) {
        Coffee_Count = coffee_Count;
    }
}