package designPatterns.observer.observer;

import designPatterns.observer.Item.Item;

public class Observer2 implements Observer{
    String email;

    public Observer2(String email) {
        this.email = email;
    }

    @Override
    public void update(Item item) {

        sendEmail(item);
    }

    public void sendEmail(Item item) {

        System.out.println("Hi " + email + ", " + item.getItemName() + " is now available at the store");
    }
}
