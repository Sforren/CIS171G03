/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.otc;

import static edu.otc.Menu.steps;

/**
 *
 * @author Dima
 */
public class DisplayOrder { // this class should display and update the order as the customer adds more items to the sandwich.

    public Ingredient[] currentOrder = new Ingredient[8];

    public void DisplayOrder() {
        for (int i = 0; i < 8; i++) {
            System.out.println(currentOrder[8]);
        }
    }
    // code for storing and updating the order
    // code for displaying the array
}
