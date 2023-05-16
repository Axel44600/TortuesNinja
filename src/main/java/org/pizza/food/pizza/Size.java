package org.pizza.food.pizza;

public enum Size {

    SMALL("petite"),
    MEDIUM("moyenne"),
    LARGE("grande");

    private final String name;

    Size(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
