package transport;

public class Truck extends Transport implements Competing {
    private Weight weight;

    public Truck(String brand, String model, double engineVolume, Weight weight) {

        super(brand, model, engineVolume);
        this.weight=weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " начал движения");

    }

    @Override
    public void stop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " закончил движения");

    }

    @Override
    public void printType() {
        if (weight == null) {
                System.out.println("Данных по авто не достаточно");
            } else {
                System.out.println("Тип авто" + weight);
            }


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
