package org.pizza.food.pizza;

public enum Ingredient {

    CHEESE("fromage"),
    PEPPERONI("pepperoni"),
    MUSHROOM("champignon");

    private final String name;

    Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
