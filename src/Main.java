public class Main {
    public static void main(String[] args) {
        Person maksim = new Person(1988,"Мaксим","Минск", "бренд-менеджером");

        Person anya = new Person(1993, "Аня", "Москва", "методистом образовательных программ");

        Person katya = new Person(1992, "Катя", "Калининград", "продакт-менеджером");

        Person artem = new Person(-15 ,"", "Москва","директором по развитию бизнеса");

        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);


        System.out.println();


        Car lada = new Car("Lad","Granta",1.5, "Желтый", 2015, "Россия");
        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0, "Черный",
                2020, "Германия");
        Car bmw = new Car("BMW","Z8",3.0, "Черный", 2021, "Германия");
        Car kia = new Car("Kia","Sportage",2.4, "красный", 2015,
                "Южной Корее");
        Car hyundai = new Car("Hyundai"," Avante",1.6, "Оранжевый", 2016,
                "Южной Корее");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);


    }
}