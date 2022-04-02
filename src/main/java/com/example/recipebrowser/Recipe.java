package com.example.recipebrowser;

import java.util.LinkedList;

public class Recipe {

    public String name;

    public LinkedList<String> allIngredients;

    public Recipe(LinkedList<String> ingredients, String name) {
        allIngredients = ingredients;
        this.name = name;
    }

    public Boolean isMaterial(String material) {
        return allIngredients.contains(material);
    }

}
