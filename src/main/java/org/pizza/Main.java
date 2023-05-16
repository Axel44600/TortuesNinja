package org.pizza;

import org.pizza.directory.PizzaDirector;
import org.pizza.food.pizza.Ingredient;
import org.pizza.food.pizza.Pizza;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pizza leonardo = new PizzaDirector(new Pizza()).leonardo();
        Pizza michelangelo = new PizzaDirector(new Pizza()).michelangelo();
        Pizza raphaelo = new PizzaDirector(new Pizza()).raphaelo();
        Pizza donatello = new PizzaDirector(new Pizza()).donatello();

        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas.add(leonardo);
        pizzas.add(michelangelo);
        pizzas.add(raphaelo);
        pizzas.add(donatello);

        System.out.println("\n");
        System.out.println("Voici les pizzas préférées de nos tortues : \n");

        for(Pizza pizza : pizzas) {
            System.out.print("La pizza de "+ pizza.getName() + " : ");
            System.out.print("c'est une " + pizza.getSize().getName() + " pizza ");
            if(pizza.isFilling()) {
                System.out.print("avec ");
                for(Ingredient ingredient : pizza.getIngredients()) {
                    System.out.print(ingredient.getName() + ", ");
                }
            } else {
                System.out.print("sans garniture, ");
            }
            System.out.print("vous allez sûrement l'adorer !");
            System.out.print("\n\n");
        }

    }
}