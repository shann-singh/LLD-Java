package threadCode;

public class ThreadCode {
    Counter counter;

    public ThreadCode() {
        this.counter = new Counter();
    }

    public void runOnThreads() throws InterruptedException {
        ThreadClass1 threadClass1 = new ThreadClass1(this.counter);
        ThreadClass2 threadClass2 = new ThreadClass2(this.counter);

        threadClass1.start();
        threadClass2.start();

        threadClass1.join();
        threadClass2.join();

        System.out.println(Counter.count);
    }


}
