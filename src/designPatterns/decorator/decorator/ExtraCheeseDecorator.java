package designPatterns.decorator.decorator;

import designPatterns.decorator.pizza.Pizza;

public class ExtraCheeseDecorator extends PizzaDecorator {

    Pizza pizza;

    public ExtraCheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getName() {
        return this.pizza.getName() + ", Extra cheese";
    }

    public int getCost() {
        return this.pizza.getCost() + 70;
    }
}
