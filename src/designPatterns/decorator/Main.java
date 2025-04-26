package designPatterns.decorator;

import designPatterns.decorator.decorator.ExtraCheeseDecorator;
import designPatterns.decorator.decorator.JalapenoDecorator;
import designPatterns.decorator.pizza.Margarita;
import designPatterns.decorator.pizza.Pizza;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Margarita();
        System.out.println(pizza.getName() + "--> Rs " + pizza.getCost());

        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println(pizza.getName() + "--> Rs " + pizza.getCost());

        pizza = new JalapenoDecorator(pizza);
        System.out.println(pizza.getName() + "--> Rs " + pizza.getCost());
    }
}
