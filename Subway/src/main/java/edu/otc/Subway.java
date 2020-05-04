/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.otc;

/**
 *
 * @author Dima
 */
public class Subway { // this is the main class. it stores ingredients and has methods to add and remove them.

    public static int size;
    public double price = 0;
    public double finalPrice = 0;

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.selectSize();
        menu.selectBread();
        menu.selectMeat();
        menu.selectCheese();
       // menu.selectVeggies();
        menu.selectVeggies1(); // for whatever reason the for loop didnt want to work so i had to do this ugly workaround
        menu.selectVeggies2();
        menu.selectVeggies3();
        menu.selectSauce();
        menu.selectSpices();
        menu.showOrder();
        // todos
        // display the questions in a gui
        // display the currentOrder[] array in a gui. this may mean that we have to get rid of the prices and the pictures so that we don't have to parse the objects since 
        // we might not end up using the other features because of time.
        // i added some prices to the ingredients but we probably dont have time for this anymore
        // add images (we probably dont have time for this anymore either)
    }

    public double finalPrice() {

        if (size == 6) {

            finalPrice = price / 2;
        }
        return finalPrice;
    }

    public static final Ingredient[] breadList = {
        new Ingredient("White", 1.00, "whiteBread.png"),
        new Ingredient("Italian Herbs and Cheese", 1.50, "herbAndCheese.png"),
        new Ingredient("Roasted Garlic", 1.50, "roastedGarlic.png"),
        new Ingredient("9 Grain Wheat", 1.00, "9GrainWheat")
    };

    public static final Ingredient[] meatList = {
        new Ingredient("Ham", 2.00, "ham.png"),
        new Ingredient("Tuna", 2.00, "tuna.png"),
        new Ingredient("Turkey", 2.00, "turkey.png"),
        new Ingredient("Teriyaki Chicken", 2.00, "teriyakiChicken.png")

    };

    public static final Ingredient[] cheeseList = {
        new Ingredient("American", 2.00, "americanCheese.png"),
        new Ingredient("Cheddar", 2.00, "cheddarCheese.png"),
        new Ingredient("Provalone", 2.00, "provaloneCheese.png"),
        new Ingredient("Swiss", 2.00, "swissCheese.png")

    };

    public static final Ingredient[] veggiesList = {
        new Ingredient("Onions", 0.50, "onions.png"),
        new Ingredient("Lettuce", 0.50, "lettuce.png"),
        new Ingredient("Tomato", 0.50, "tomato.png"),
        new Ingredient("Pickles", 0.50, "pickles.png"),
        new Ingredient("Nothing", 0.00, "nothing.png")
    };

    public static final Ingredient[] SauceList = {
        new Ingredient("Mayonnaise", 0.25, "mayonnaise.png"),
        new Ingredient("Ketchup", 0.25, "ketchup.png"),
        new Ingredient("Mustard", 0.25, "mustard.png"),
        new Ingredient("Ranch", 0.25, "ranch.png")
    };

    public static final Ingredient[] SpiceList = {
        new Ingredient("Salt", 0.00, "salt.png"),
        new Ingredient("Pepper", 0.00, "pepper.png"),
        new Ingredient("Salt and Pepper", 0.00, "saltAndPepper.png")
    };

}

class Ingredient { // this class creates ingredients

    Ingredient(String type, double price, String picture) {

    }
}
