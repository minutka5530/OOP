package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;
    private String fuel;
    private double fuelPercentage;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int maxSpeed,
                     double fuelPercentage,
                     String fuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.fuelPercentage = fuelPercentage;
        this.fuel = fuel;
        setColor(color);
        setMaxSpeedMovement(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            color = "Не коректно";
        }
        this.color = color;
    }

    public int getMaxSpeedMovement() {
        return maxSpeed;
    }

    public void setMaxSpeedMovement(int maxSpeedMovement) {
        if(maxSpeedMovement<0){
            maxSpeedMovement = 1;
        }
        this.maxSpeed = maxSpeedMovement;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if(fuelPercentage>=0.00 && fuelPercentage<=100.00){

        }
        this.fuelPercentage = fuelPercentage;
    }
    public abstract void refill();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuel='" + fuel + '\'' +
                ", fuelPercentage=" + fuelPercentage +
                '}';
    }
}
