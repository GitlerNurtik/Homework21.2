public class Car implements AutoCloseable, AutoStartAble{

    @Override
    public void close() {
        System.out.println("Your car is closed.");
    }
    @Override
    public void Drive() {
        System.out.println("Your car is started.");
    }
}
