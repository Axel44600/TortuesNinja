package org.pizza.builder;

import org.pizza.food.pizza.Ingredient;
import org.pizza.food.pizza.Pizza;
import org.pizza.food.pizza.Size;

import java.util.List;

public class PizzaBuilder {

    private Pizza pizza;

    public PizzaBuilder(Pizza pizza) {
        this.pizza = pizza;
    }

    public void name(String name) {
        pizza.setName(name);
    }

    public void size(Size size) {
        pizza.setSize(size);
    }

    public void filling(Boolean filling) {
        pizza.setFilling(filling);
    }

    public void ingredients(List<Ingredient> ingredients) {
        pizza.setIngredients(ingredients);
    }

    public Pizza build() {
        return pizza;
    }


}
