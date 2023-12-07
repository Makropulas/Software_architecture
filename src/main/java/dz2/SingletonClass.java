package dz2;

public class SingletonClass {
    private static final SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return INSTANCE;
    }

    public void printHash() {
        System.out.println(this.hashCode());
    }
}
