package transport;

public abstract class Driver<T extends Transport> {
    private final String fullName;
    private boolean hasDriversLicense;
    private int experience;

    public Driver(String fullName, boolean hasDriversLicense, int experience) {
        this.fullName = fullName;
        this.hasDriversLicense = hasDriversLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }


    public boolean isHasDriversLicense() {
        return hasDriversLicense;
    }

    public void setHasDriversLicense(boolean hasDriversLicense) {
        this.hasDriversLicense = hasDriversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove(T transport);

    public abstract void stopMove(T transport);

    public abstract void refill(T transport);

    public void printInfo(T transport) {
        System.out.println("водитель " + fullName + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }
}
