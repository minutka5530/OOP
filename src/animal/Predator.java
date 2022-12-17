package animal;

public class Predator extends Mammal{

    public Predator(String name,
                    int age,
                    String environment,
                    int speed,
                    String food) {
        super(name, age, environment, speed, food);
    }
    public void hunt(){
        System.out.println("Хищник питаеться охотиться");
    }

    @Override
    public void walk() {
        System.out.println("Хищник гуляет в лесу");

    }

    @Override
    public void eat() {
        System.out.println("Хищник питаеться" + getFood());

    }

    @Override
    public void sleep() {
        System.out.println("Хищник спит ночью и дем");

    }

    @Override
    public void go() {
        System.out.println("Хищник ходит в лесу");

    }
}
