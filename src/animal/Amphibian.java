package animal;

public class Amphibian extends Animal{

    public Amphibian(String name,
                     int age,
                     String environment) {
        super(name, age, environment);

    }
    public void  huntAmphibian(){
        System.out.println("Земноводные охотяться возле воды");
    }

    @Override
    public void eat() {
        System.out.println("Земноводные едят насикомых");

    }

    @Override
    public void sleep() {
        System.out.println("Земноводные спят ночью");

    }

    @Override
    public void go() {
        System.out.println("Земноводные хотя возле воды");

    }
}
