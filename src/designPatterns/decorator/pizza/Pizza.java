package designPatterns.decorator.pizza;

public abstract class Pizza {
    public String name = "Pizza";

    public String getName() {
        return name;
    }

    public abstract int getCost();
}
