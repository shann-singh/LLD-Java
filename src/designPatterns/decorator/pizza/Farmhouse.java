package designPatterns.decorator.pizza;

public class Farmhouse extends Pizza {

    public Farmhouse() {
        name = "Farmhouse";
    }

    public int getCost() {
        return 299;
    }
}
