public class Car {
    String brand;
    String mode;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String mode, double engineVolume, String color, int year, String country) {

        this.brand = brand;

        this.mode = mode;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }

        this.engineVolume = engineVolume;
        if (color == null || color.isEmpty()) {
            color = "Белый";
        }
        this.color = color;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        this.country = country;
    }


    @Override
    public String toString() {
        return brand + " " + mode + " Сборка в " + country + " Цвет - " + color + " Объем двигателя - " + engineVolume +
                " Год выпуска - " + year + "";
    }
}
