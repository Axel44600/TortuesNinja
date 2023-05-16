package org.pizza.directory;

import org.pizza.builder.PizzaBuilder;
import org.pizza.food.pizza.Ingredient;
import org.pizza.food.pizza.Pizza;
import org.pizza.food.pizza.Size;

import java.util.ArrayList;

public class PizzaDirector {

    private final PizzaBuilder pizzaBuilder;
    private ArrayList<Ingredient> ingredients;

    public PizzaDirector(Pizza pizza) {
        this.pizzaBuilder = new PizzaBuilder(pizza);
    }

    public Pizza leonardo() {
        ingredients = new ArrayList<>();

        pizzaBuilder.name("Leonardo");
        pizzaBuilder.size(Size.LARGE);
        pizzaBuilder.filling(true);

        ingredients.add(Ingredient.PEPERONI);
        ingredients.add(Ingredient.CHEESE);
        pizzaBuilder.ingredients(ingredients);
        return pizzaBuilder.build();
    }

    public Pizza michelangelo() {
        ingredients = new ArrayList<>();

        pizzaBuilder.name("Michelangelo");
        pizzaBuilder.size(Size.SMALL);
        pizzaBuilder.filling(true);

        ingredients.add(Ingredient.PEPERONI);
        ingredients.add(Ingredient.MUSHROOM);
        pizzaBuilder.ingredients(ingredients);
        return pizzaBuilder.build();
    }

    public Pizza raphaelo() {
        pizzaBuilder.name("Raphaelo");
        pizzaBuilder.size(Size.SMALL);
        pizzaBuilder.filling(false);

        return pizzaBuilder.build();
    }

    public Pizza donatello() {
        ingredients = new ArrayList<>();

        pizzaBuilder.name("Donatello");
        pizzaBuilder.size(Size.MEDIUM);
        pizzaBuilder.filling(true);

        ingredients.add(Ingredient.CHEESE);
        ingredients.add(Ingredient.PEPERONI);
        ingredients.add(Ingredient.MUSHROOM);
        pizzaBuilder.ingredients(ingredients);
        return pizzaBuilder.build();
    }
}
