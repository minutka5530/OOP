package transport;

import java.time.LocalDate;

public class Car extends Transport{
    private String gears;
    private final String  body;
    private final String number;
    private int seats;
    private boolean summerTyres;
    private  Kye kye;
    private Insurance insurance;


    public Car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               int maxSpeed,
               String gears,
               String body,
               String number,
               int seats,
               boolean summerTyres,
               Kye kye,

               Insurance insurance,
               String fuel,
               double fuelPercentage) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuelPercentage,fuel);
        this.gears = gears;
        this.body = body;
        this.number = number;
        this.seats = seats;
        this.summerTyres = summerTyres;
        this.kye = kye;
        this.insurance = insurance;
    }
    @Override
    public void refill() {
        System.out.println("заправлять бензином");
        setFuelPercentage(100);

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
    public String getBody() {
        return body;
    }

    public String getNumber() {
        return number;
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

}
