package transport;

import java.time.LocalDate;

public class Car extends Transport implements Competing {
    private TypeOfBody typeOfBody;

    public Car(String brand,
               String model,
               double engineVolume,
               TypeOfBody typeOfBody) {

        super(
                brand,
                model,
                engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void start() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " начала движения");

    }

    @Override
    public void stop() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " закончила движения");

    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто не достаточно");
        } else {
            System.out.println("Тип авто" + typeOfBody);
        }
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
