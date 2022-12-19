package transport;

public class Bus extends Transport implements Competing {


    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " "+ getModel() + " начал движения");

    }

    @Override
    public void stop() {
        System.out.println("Автобус " + getBrand() + " "+ getModel() + " закончил движения");

    }

    @Override
    public void pidStop() {
        System.out.println("Автобус прошел пид-стоп");

    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 15);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 100);
    }
}
