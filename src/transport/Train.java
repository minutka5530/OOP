package transport;

public class Train extends Transport{
    private int cost;
    private int time;
    private String departureStation;
    private String arrivalStation;
    private int wagons;

    public Train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 String color,
                 int maxSpeed,
                 int cost,
                 int time,
                 String departureStation,
                 String arrivalStation,
                 int wagons,
                 String fuel,
                 double fuelPercentage) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuelPercentage,fuel);
        this.cost = cost;
        this.time = time;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.wagons = wagons;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    @Override
    public void refill() {
        System.out.println("Заправляеться дизелем" + getFuel());
        setFuelPercentage(100);
    }

    @Override
    public String toString() {
        return "Train{" +
                "cost=" + cost +
                ", time=" + time +
                ", departureStation='" + departureStation + '\'' +
                ", arrivalStation='" + arrivalStation + '\'' +
                ", wagons=" + wagons +
                "} " + super.toString();
    }
}

