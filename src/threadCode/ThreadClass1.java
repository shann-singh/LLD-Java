package threadCode;

public class ThreadClass1 extends Thread {
    Counter counter;

    public ThreadClass1(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for(int i=0; i<10000; i++) {
            this.counter.increment();
        }
    }
}
