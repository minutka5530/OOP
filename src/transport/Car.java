package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String mode;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String gears;

    private final String body;

    private final String number;

    private int seats;

    private boolean summerTyres;
    private Key key;

    public class Key {
        private boolean keyless;
        private boolean remoteEngineStart;

        public Key(boolean keyless, boolean remoteEngineStart) {
            this.keyless = keyless;
            this.remoteEngineStart = remoteEngineStart;
        }

        public Key() {
            this(false, false);
        }

        public boolean isKeyless() {
            return keyless;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
    }

    public static class Insurance {
        private final LocalDate validity;
        private final double price;
        private final String number;

        public LocalDate getValidity() {
            return validity;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public Insurance(LocalDate validity, double price, String number) {
            if (validity == null) {
                this.validity = LocalDate.now().plusDays(365);
            } else {

                this.validity = validity;
            }
            this.price = price;

            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;

            }
        }

    }


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Car(String brand, String mode, double engineVolume, String color, int year, String country,
               String body, String number, Key key) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }

        this.brand = brand;
        if (mode == null || mode.isEmpty()) {
            mode = "default";
        }
        this.mode = mode;
        setEngineVolume(engineVolume);
        if (color == null || color.isEmpty()) {
            color = "Белый";
        }
        this.color = color;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
        if (body == null || body.isEmpty()) {
            body = "седан";
        }
        this.body = body;
        if (number == null || number.isEmpty()) {
            number = "х000хх000";
        }
        this.number = number;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getMode() {
        return mode;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
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
        if (engineVolume <= 0) {
            engineVolume = 1.5;
            this.engineVolume = engineVolume;
        }
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
        if (gears == null || gears.isEmpty()) {
            gears = "Механика";
        }
        this.gears = gears;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats <= 0) {
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

    public void changeTyres() {
        setSummerTyres(!summerTyres);
    }

    public boolean isValidNumber() {
        boolean result = true;
        result = result && number.length() == 9;

        result = result && Character.isLetter(number.charAt(0))
                && Character.isLetter(number.charAt(4))
                && Character.isLetter(number.charAt(5));

        result = result && Character.isDigit(number.charAt(0))
                && Character.isDigit(number.charAt(2))
                && Character.isDigit(number.charAt(3))
                && Character.isDigit(number.charAt(6))
                && Character.isDigit(number.charAt(7))
                && Character.isDigit(number.charAt(8));
        return result;


    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mode='" + mode + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", gears='" + gears + '\'' +
                ", body='" + body + '\'' +
                ", number='" + number + '\'' +
                ", seats=" + seats +
                ", summerTyres=" + summerTyres +
                '}';
    }
}
