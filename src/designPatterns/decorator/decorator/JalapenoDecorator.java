package designPatterns.decorator.decorator;

import designPatterns.decorator.pizza.Pizza;

public class JalapenoDecorator extends PizzaDecorator {

    Pizza pizza;

    public JalapenoDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getName() {
        return this.pizza.getName() + ", Extra olives";
    }

    public int getCost() {
        return this.pizza.getCost() + 90;
    }
}
