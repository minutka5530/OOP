package transport;

import java.time.LocalDate;

public class Car {
    private  String brand;
    private  String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gears;
    private final String  body;
    private final String number;
    private int seats;
    private boolean summerTyres;
    private  Kye kye;
    private Insurance insurance;



    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String body,
               String number) {
        if(brand == null || brand.isEmpty() || brand.isBlank()){
            brand = "default";
            this.brand = brand;

            if(model == null || model.isEmpty() || model.isBlank()) {
                model = "default";
            }
            this.model = model;
            if (engineVolume<=0){
                engineVolume = 1.5;
            }
            setEngineVolume(engineVolume);

            if(color == null || color.isEmpty() || color.isBlank()){
                color = "белый";
            }
        }
        this.color = color;
        if (productionYear<=0){
            productionYear = 2000;
        }
        this.productionYear = productionYear;

        if(productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            productionCountry = "default";
        }
        this.productionCountry = productionCountry;
        if (body == null || body.isEmpty()){
            body = "Механика";
        }
        this.body = body;
        if (number == null || number.isEmpty()){
            number = "x000xx000";
        }
        this.number = number;
        setKye(kye);
        setInsurance(insurance);

    }
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry
               ) {
        this(
                brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                null,
                null
        );
    }

    public Kye getKye() {
        return kye;
    }

    public void setKye(Kye kye) {
        if (kye == null){
            kye = new Kye(false, false);
        }
        this.kye = kye;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null){
            insurance = new Insurance(null,10000,null);
        }
        this.insurance = insurance;
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

    public String getBody() {
        return body;
    }

    public String getNumber() {
        return number;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume<=0){
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null || gears.isEmpty()){
            gears = "Механика";
        }
        this.gears = gears;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats<=0){
            seats = 5;
        }
        this.seats = seats;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }
    public void changeTres(){
        setSummerTyres(!summerTyres);
    }
    public boolean isValidNumber(){
        return number.length() == 9
                && Character.isLetter(number.charAt(0))
                && Character.isDigit(number.charAt(4))
                && Character.isDigit(number.charAt(5))

                && Character.isLetter(number.charAt(1))
                && Character.isLetter(number.charAt(2))
                && Character.isLetter(number.charAt(3))
                && Character.isLetter(number.charAt(6))
                && Character.isLetter(number.charAt(8));
    }


    public static class Kye{
        private final boolean remoteRun;
        private final boolean withoutKyeAccess;

        public Kye(boolean remoteRun, boolean withoutKyeAccess) {
            this.remoteRun = remoteRun;
            this.withoutKyeAccess = withoutKyeAccess;
        }
        public boolean isRemoteRun(){
            return remoteRun;
        }
        public boolean isWithoutKyeAccess(){
            return withoutKyeAccess;
        }

        @Override
        public String toString() {
            return "Kye{" +
                    "remoteRun=" + remoteRun +
                    ", withoutKyeAccess=" + withoutKyeAccess +
                    '}';
        }
    }
    public static class Insurance{
        private final LocalDate expireDate;
        private final int cost;
        private final String number;

        public Insurance(LocalDate expireDate, int cost, String number) {
            if(expireDate == null){
                expireDate = LocalDate.now().plusDays(365);
            }
            this.expireDate = expireDate;
            if(cost<=0){
                cost = 10_000;
            }
            this.cost = cost;
            if(number==null || number.isEmpty()){
                number = "XXXXXXXXx";
            }

            this.number = number;
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "expireDate=" + expireDate +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }

        public void printCheckExpired(){
            boolean expared =  expireDate.isAfter(LocalDate.now());
            if(expared){
                System.out.println("Надо ехать менять страховку");
            }
        }
        public  void  printCheckNumber(){
            boolean correct =  number.length() == 9;
            if (!correct){
                System.out.println("Номер страховки не коретктный!");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", gears='" + gears + '\'' +
                ", body='" + body + '\'' +
                ", number='" + number + '\'' +
                ", seats=" + seats +
                ", summerTyres=" + summerTyres +
                ", kye=" + kye +
                ", insurance=" + insurance +
                '}';
    }
}
