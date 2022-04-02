package com.example.recipebrowser;

import java.util.LinkedList;

public class RecipeFinder {

    public LinkedList<Recipe> allRecipes = new LinkedList<Recipe>();

    public RecipeFinder() {
        LinkedList<String> craftingTableIngredients = new LinkedList<String>();
        craftingTableIngredients.add("wood");
        Recipe craftingTable = new Recipe(craftingTableIngredients, "Crafting Table");
        allRecipes.add(craftingTable);
    }

    public LinkedList<Recipe> findRecipes(String material) {
        LinkedList<Recipe> returnList = new LinkedList<Recipe>();
        for (Recipe r : allRecipes) {
            for (String i : r.allIngredients) {
                if (i.equals(material)) {
                    returnList.add(r);
                }
            }
        }
        return returnList;
    }


}
