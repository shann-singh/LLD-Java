package threadCode;

public class Main {

    public static void main(String[] args) {
        ThreadCode threadCode = new ThreadCode();
        try {
            threadCode.runOnThreads();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
