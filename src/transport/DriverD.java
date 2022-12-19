package transport;

public class DriverD extends Driver<Bus>{
    public DriverD(String fullName, boolean hasDriversLicense, int experience) {
        super(fullName, hasDriversLicense, experience);
    }

    @Override
    public void startMove(Bus transport) {
        transport.start();

    }

    @Override
    public void stopMove(Bus transport) {
        transport.stop();

    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель" + getFullName() + " заправляет автобус" + transport.getBrand());

    }
}
