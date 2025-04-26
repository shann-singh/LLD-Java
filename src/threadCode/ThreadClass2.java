package threadCode;

public class ThreadClass2 extends Thread {
    Counter counter;

    public ThreadClass2(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for(int i=0; i<10000; i++) {
            this.counter.increment();
        }
    }
}
