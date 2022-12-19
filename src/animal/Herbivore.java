package animal;

public class Herbivore extends Mammal {
    public Herbivore(String name,
                     int age,
                     String environment,
                     int speed,
                     String food) {
        super(name, age, environment, speed, food);
    }

    public void graze() {
        System.out.println("Тровоядное посется");
    }

    @Override
    public void eat() {
        System.out.println("Тровоядное питается" + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Тровоядное спит ночью");
    }

    @Override
    public void go() {
        System.out.println("Тровоядное ходит в лесу");

    }

    @Override
    public void walk() {
        System.out.println("Тровоядное гуляет по траве");

    }
}
