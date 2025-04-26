package designPatterns.singleton;

public class Singleton {
    private static volatile Singleton INSTANCE;

    private void Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    public void log(String data) {
        System.out.println(data);
    }
}
