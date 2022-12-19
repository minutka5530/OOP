package transport;

public class DriverC extends Driver<Truck> {


    public DriverC(String fullName, boolean hasDriversLicense, int experience) {
        super(fullName, hasDriversLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();

    }

    @Override
    public void stopMove(Truck transport) {
        transport.stop();

    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель" + getFullName() + " заправляет грузовик" + transport.getBrand());

    }
}
