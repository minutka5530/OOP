package transport;

public class DriverB extends Driver<Car>{
    public DriverB(String fullName, boolean hasDriversLicense, int experience) {
        super(fullName, hasDriversLicense, experience);
    }

    @Override
    public void startMove(Car transport) {
        transport.start();

    }

    @Override
    public void stopMove(Car transport) {
        transport.stop();

    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель" + getFullName() + " заправляет автомобиль" + transport.getBrand());

    }
}
