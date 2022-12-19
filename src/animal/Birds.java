package animal;

import java.util.Objects;

public abstract class Birds extends Animal{
    private String movement;

    public Birds(String name,
                 int age,
                 String environment,
                 String movement) {
        super(name, age, environment);
        this.movement = movement;
    }

    public abstract void hunt();

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(movement, birds.movement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movement);
    }
}
