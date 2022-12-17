import animal.Animal;
import animal.Herbivore;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Train lastoxhka = new Train(
                "Ласточка",
                "B-901",
                2011,
                "Russia",
                null,
                301,
                3500,
                2,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11,
                "Дизель",
                50
        );
        Train lenengrad = new Train(
                "Ласточка",
                "D-125",
                2019,
                "Russia",
                null,
                270,
                1700,
                5,
                "Ленинградский вокзал",
                "Лененгралско-пасажирский",
                8,
                "Дизель",
                80
        );
        System.out.println(lastoxhka);
        System.out.println(lenengrad);


        Bus texi = new Bus(
                "ласточка",
                "мощ",
                2022,
                "Russia",
                "white",
                350,
                "Бензин",
                57
                );
        Bus pazik = new Bus(
                "Pazik",
                "315",
                2005,
                "Russia",
                "Black",
                100,
                "Дизель",
                55

                );
        Bus kia = new Bus(
                "Kia",
                "Pion",
                2021,
                "Корея",
                "blue",
                120,
                "бензин",
                50
                );
        System.out.println(texi);
        System.out.println(pazik);
        System.out.println(kia);



        Animal gazelle = new Herbivore("Газель", 2, "земля", 60, "Трава" );
        System.out.println(gazelle);

    }





}