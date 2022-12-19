package transport;

public class Bus extends Transport implements Competing {
    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity= capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто не достаточно");
        } else {
            System.out.println("Тип авто" + capacity);
        }

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
