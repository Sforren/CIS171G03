/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.otc;

import static edu.otc.Subway.breadList;
import static edu.otc.Subway.size;
import java.util.Scanner;

/**
 *
 * @author Dima
 */
public class Menu { // this class should display the menu with availible items and update the menu as the customer selects more items.

    DisplayOrder display = new DisplayOrder();
    public int steps; // count the step that the customer is on and display the approporiate menu options. if they are on the final step,
    //display the price and the thank you message. this is for the javafx.

    public void selectSize() {
        System.out.println("Welcome to Subway.");
        System.out.println("Would you like a 6-inch or a 12-inch sub?");
        System.out.println("type 1 for 6 inch, type 2 for 12 inch");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (choice < 1 || choice > 2) {
            System.out.println("Invalid Selection");
            System.out.println("type 1 for 6 inch, type 2 for 12 inch");
            choice = input.nextInt();
            if (choice == 1) {
                size = 6;
            } else if (choice == 2) {
                size = 12;
            }
        }
    }

    public void selectBread() {
        System.out.println("What kind of bread would you like?");
        System.out.println("type 1 for White, 2 for Italian Herbs and Cheese, 3 for Roasted Garlic, 4 for 9 Grain Wheat");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Invalid Selection");
            System.out.println("type 1 for White, 2 for Italian Herbs and Cheese, 3 for Roasted Garlic, 4 for 9 Grain Wheat");
            choice = input.nextInt();

            display.currentOrder[1] = breadList[choice - 1];
        }

    }

    public void selectMeat() {
        System.out.println("What kind of meat would you like?");
        System.out.println("type 1 for ham, 2 for tuna, 3 for Turkey, 4 for Teriyaki Chicken");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Invalid Selection");
            System.out.println("type 1 for ham, 2 for tuna, 3 for Turkey, 4 for Teriyaki Chicken");
            choice = input.nextInt();

            display.currentOrder[2] = breadList[choice - 1];
        }

    }

    public void selectCheese() {
        System.out.println("What kind of cheese would you like?");
        System.out.println("type 1 for American, 2 for Cheddar, 3 for Provalone, 4 for Swiss");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Invalid Selection");
            System.out.println("type 1 for American, 2 for Cheddar, 3 for Provalone, 4 for Swiss");
            choice = input.nextInt();

            display.currentOrder[3] = breadList[choice - 1];
        }

    }
    
    /*
    public void selectVeggies() {
        for (int i = 0; i < 3; i++) {
            System.out.println("What kind of veggies would you like? pick up to 3");
            System.out.println("type 1 for onions, 2 for lettuce, 3 for tomatoes, 4 for pickles, 5 for nothing");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            while (choice < 1 || choice > 5) {
                System.out.println("Invalid Selection");
                System.out.println("type 1 for onions, 2 for lettuce, 3 for tomatoes, 4 for pickles, 5 for nothing");
                choice = input.nextInt();

                display.currentOrder[4 + i] = breadList[choice - 1];
            }
        }
    }
    */
    
    public void selectVeggies1() {

        System.out.println("What kind of veggies would you like? pick up to 3");
        System.out.println("type 1 for onions, 2 for lettuce, 3 for tomatoes, 4 for pickles, 5 for nothing");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (choice < 1 || choice > 5) {
            System.out.println("Invalid Selection");
            System.out.println("type 1 for onions, 2 for lettuce, 3 for tomatoes, 4 for pickles, 5 for nothing");
            choice = input.nextInt();

            display.currentOrder[4] = breadList[choice - 1];
        }

    }

    public void selectVeggies2() {

        System.out.println("What kind of veggies would you like? pick up to 3");
        System.out.println("type 1 for onions, 2 for lettuce, 3 for tomatoes, 4 for pickles, 5 for nothing");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (choice < 1 || choice > 5) {
            System.out.println("Invalid Selection");
            System.out.println("type 1 for onions, 2 for lettuce, 3 for tomatoes, 4 for pickles, 5 for nothing");
            choice = input.nextInt();

            display.currentOrder[5] = breadList[choice - 1];
        }

    }

    public void selectVeggies3() {

        System.out.println("What kind of veggies would you like? pick up to 3");
        System.out.println("type 1 for onions, 2 for lettuce, 3 for tomatoes, 4 for pickles, 5 for nothing");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (choice < 1 || choice > 5) {
            System.out.println("Invalid Selection");
            System.out.println("type 1 for onions, 2 for lettuce, 3 for tomatoes, 4 for pickles, 5 for nothing");
            choice = input.nextInt();

            display.currentOrder[6] = breadList[choice - 1];
        }

    }

    public void selectSauce() {
        System.out.println("What kind of sauce would you like?");
        System.out.println("type 1 for mayonnaise, 2 for ketchup, 3 for mustard, 4 ranch");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Invalid Selection");
            System.out.println("type 1 for mayonnaise, 2 for ketchup, 3 for mustard, 4 ranch");
            choice = input.nextInt();

            display.currentOrder[7] = breadList[choice - 1];
        }

    }

    public void selectSpices() {
        System.out.println("Would you like salt or pepper?");
        System.out.println("type 1 for salt, 2 for pepper, 3 for both");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Invalid Selection");
            System.out.println("type 1 for salt, 2 for pepper, 3 for both");
            choice = input.nextInt();

            display.currentOrder[8] = breadList[choice - 1];
        }
    }
}
