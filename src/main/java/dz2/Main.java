package dz2;

public class Main {
    public static void main(String[] args) {
        SingletonClass singleton1 = SingletonClass.getInstance();
        singleton1.printHash();
        SingletonClass singleton2 = SingletonClass.getInstance();
        singleton2.printHash();
    }
}
