package threadCode;

public class Counter {
    public static int count = 0;

    public synchronized void increment() {
        count++;
    }
}
