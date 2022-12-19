package animal;

public class NonFkyingBird extends Birds{
    private String movement;

    public NonFkyingBird(String name,
                         int age,
                         String environment,
                         String movement) {
        super(name, age, environment, movement );
    }

    @Override
    public void eat() {
        System.out.println("Не летающая птица есть насекомых");

    }

    @Override
    public void sleep() {
        System.out.println("Не летающая птица спит ночью");

    }

    @Override
    public void go() {
        System.out.println("Не летающая хотит" + getMovement());

    }

    @Override
    public void hunt() {
        System.out.println("Не летающая птица охотиться на земле");

    }
}
