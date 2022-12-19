package transport;

public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Грузовик " + getBrand() + " "+ getModel() + " начал движения");

    }

    @Override
    public void stop() {
        System.out.println("Грузовик " + getBrand() + " "+ getModel() + " закончил движения");

    }

    @Override
    public void pidStop() {
        System.out.println("Грузовик прошел пид-стоп");

    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 10);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 120);
    }
}
