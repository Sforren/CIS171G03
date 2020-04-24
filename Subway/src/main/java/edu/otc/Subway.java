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
        new Ingredient("Italian Herbs and Cheese", 1.50, "herbAndCheese.png")
    };

    public static final Ingredient[] meatList = {
        new Ingredient("Ham", 2.00, "ham.png")
    };

    public static final Ingredient[] cheeseList = {
        new Ingredient("American", 2.00, "americanCheese.png")
    };

    public static final Ingredient[] veggiesList = {
        new Ingredient("Onions", 0.50, "onions.png")
    };

    public static final Ingredient[] SauceList = {
        new Ingredient("Mayonnaise", 0.25, "mayonnaise.png")
    };

}

class Ingredient { // this class creates ingredients

    Ingredient(String type, double price, String picture) {

    }
}
