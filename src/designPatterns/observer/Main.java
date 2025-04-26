package designPatterns.observer;

import designPatterns.observer.observable.IphoneObservable;
import designPatterns.observer.observable.Observable;
import designPatterns.observer.observer.Observer;
import designPatterns.observer.observer.Observer1;
import designPatterns.observer.observer.Observer2;

public class Main {
    public static void main(String[] args) {
        Observable iphoneSubscription = new IphoneObservable();
        Observer observer1 = new Observer1("one@gmail.com");
        Observer observer2 = new Observer1("two@gmail.com");
        Observer observer3 = new Observer1("shreya.ddn15@gmail.com");

        iphoneSubscription.add(observer1);
        iphoneSubscription.add(observer2);
        iphoneSubscription.add(observer3);

        iphoneSubscription.setData(200);

        iphoneSubscription.remove(observer3);

        iphoneSubscription.setData(500);
    }
}
