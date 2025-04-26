package designPatterns.observer.observable;

import designPatterns.observer.Item.Item;
import designPatterns.observer.observer.Observer;

public interface Observable {
    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();

    void setData(int count);

    Item getData();
}
