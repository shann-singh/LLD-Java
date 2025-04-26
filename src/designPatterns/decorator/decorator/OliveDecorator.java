package designPatterns.decorator.decorator;

import designPatterns.decorator.pizza.Pizza;

public class OliveDecorator extends PizzaDecorator {

    Pizza pizza;

    public OliveDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getName() {
        return this.pizza.getName() + ", Extra olives";
    }

    public int getCost() {
        return this.pizza.getCost() + 50;
    }
}
