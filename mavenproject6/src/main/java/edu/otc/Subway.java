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

    public static void main(String[] args) {
        // todos
        // add more ingredients
        // 
        // create gui 
    }
    public int size;
    public double price = 0;
    public double finalPrice = 0;

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
        new Ingredient("Black Forest Ham", 2.00, "blackForest.png"),
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
        new Ingredient("Peppers", 0.50, "peppers.png"),
        new Ingredient("Pickles", 0.50, "pickles.png"),
        new Ingredient("Cucumbers", 0.50, "cucumbers.png")
    };

    public static final Ingredient[] SauceList = {
        new Ingredient("Mayonnaise", 0.25, "mayonnaise.png"),
        new Ingredient("Ketchup", 0.25, "ketchup.png"),
        new Ingredient("Mustard", 0.25, "mustard.png"),
        new Ingredient("Oil", 0.25, "oil.png"),
        new Ingredient("Ranch", 0.25, "ranch.png")
    };

}

class Ingredient { // this class creates ingredients

    Ingredient(String type, double price, String picture) {

    }
}
