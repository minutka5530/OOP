import animal.Animal;
import animal.Herbivore;
import transport.*;

import java.util.Random;


public class Main {
    private final static Random RANDOM = new Random();
    public static void main(String[] args) {
        int counter = 1;
        Car car1 = generateCar(counter++);
        Car car2 = generateCar(counter++);
        Car car3 = generateCar(counter++);
        Car car4 = generateCar(counter++);

        Bus bus1 = generateBus(counter++);
        Bus bus2 = generateBus(counter++);
        Bus bus3 = generateBus(counter++);
        Bus bus4 = generateBus(counter++);

        Truck truck1 = generateTruck(counter++);
        Truck truck2 = generateTruck(counter++);
        Truck truck3 = generateTruck(counter++);
        Truck truck4 = generateTruck(counter++);

        truck2.start();
        truck2.stop();
        DriverB maksim = new DriverB("Maks", true,6);
        DriverC petr = new DriverC("petr", true, 10);
        DriverD kiril = new DriverD("kiril", true, 5);

        maksim.startMove(car1);
        maksim.stopMove(car1);
        maksim.refill(car1);
        maksim.printInfo(car1);




    }
    public static Car generateCar(int number){
        return new Car("марка #" + number, "модель" + number, 1.6, TypeOfBody.SEDAN);
    }
    public static Bus generateBus(int number){
        return new Bus("марка #" + number,"модель#" + number, 2.5, Capacity.EXTRA_SMALL);
    }
    public static Truck generateTruck(int number){
        return new Truck("марка#" + number,"модель#" + number, 1.6, Weight.N1);
    }

}