import transport.Car;

public class Main {
    public static void main(String[] args) {
        Person maksim = new Person(
                1988,
                "Максим",
                "Минск",
                "бренд-менеджером");
        Person ana = new Person(
                1993,
                "Аня",
                "Москва",
                "методистом образовательных программ");
        Person kata = new Person(
                1992,
                "Катя", "Калиненград",
                "продакт-менеджером");
        Person artem = new Person( 1995,
                "Артем",
                "Москва",
                "директором по развитию бизнеса");
        Person vladimir = new Person(
                2001,
                "Владимир",
                "Казань",
                null);

        System.out.println(maksim);
        System.out.println(ana);
        System.out.println(kata);
        System.out.println(artem);
        System.out.println(vladimir);
        System.out.println();


        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "Желтый",
                2015,
                "России");
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "Черный",
                2020,
                "Германия");
        Car bmw = new Car(
                "BMW",
                "Z8",
                1.7,
                "Черный",
                2021,
                "Германии");
        Car kia = new Car(
                "KIA",
                "Sportage",
                2.4,
                "красный",
                2018,
                "Южная корея");
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.7,
                "Желтый",
                2015,
                "Южная корея");

        System.out.println(lada);

        Flower roza = new Flower(
                "роза",
                "Голандия",
                35.59
        );
        Flower hrizantima = new Flower(
                "Хризантема",
                null,
                35.59
        );
        hrizantima.setLifeSpan(5);
        Flower pion = new Flower(
                "Пион",
                "Англии",
                69.9
        );
        pion.setLifeSpan(1);
        Flower gipsofila = new Flower(
                "Гипсофила",
                "Турция",
                19.5
        );
        gipsofila.setLifeSpan(10);

        Bouquet bouquet = new Bouquet(
                new Flower[]{
                        roza,
                        roza,
                        roza,

                        hrizantima,
                        hrizantima,
                        hrizantima,
                        hrizantima,
                        hrizantima,

                        gipsofila


                }
        );

        bouquet.printInfo();






    }
}