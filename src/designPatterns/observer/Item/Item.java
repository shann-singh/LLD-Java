package designPatterns.observer.Item;

public abstract class Item {
    private String name;
    private int count;

    public Item(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getItemName() {
        return this.name;
    };

    public int getItemCount() {
        return this.count;
    }

    public void setItemCount(int count) {
        this.count = count;
    }
}
