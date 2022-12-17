package transport;

public class Bus extends Transport {


    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               int maxSpeed,
               String fuel,
               double fuelPercentage) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuelPercentage,fuel);
    }
    @Override
    public void refill() {
        System.out.println("автобус запровляеться дизелем " + getFuel());
        setFuelPercentage(100);
    }
}
