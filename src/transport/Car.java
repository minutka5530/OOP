package transport;

import java.time.LocalDate;

public class Car extends Transport implements Competing{
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Машина " + getBrand() + " "+ getModel() + " начала движения");

    }

    @Override
    public void stop() {
        System.out.println("Машина " + getBrand() + " "+ getModel() + " закончила движения");

    }

    @Override
    public void pidStop() {
        System.out.println("Машина прошла пид-стоп");

    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 5);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 150);
    }
}
