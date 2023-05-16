package org.pizza.food.pizza;

public enum Ingredient {

    CHEESE("fromage"),
    PEPERONI("pepperoni"),
    MUSHROOM("champignon");

    private String name;

    Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
