package designPatterns.observer.observable;

import java.util.ArrayList;
import java.util.List;

import designPatterns.observer.Item.Iphone;
import designPatterns.observer.Item.Item;
import designPatterns.observer.observer.Observer;

public class IphoneObservable implements Observable {
    List<Observer> observerList = new ArrayList<>();
    Iphone iphone;

    public IphoneObservable() {
        iphone = new Iphone();
    }

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        int index = -1;
        for(int i=0; i<observerList.size(); i++) {
            if (observer == observerList.get(i)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            observerList.remove(index);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            Observer observer = observerList.get(i);
            observer.update(iphone);
        }
    }

    public void setData(int count) {
        iphone.setItemCount(count);
        notifyObservers();
    }

    public Item getData() {
        return iphone;
    }
}
