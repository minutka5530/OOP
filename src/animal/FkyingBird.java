package animal;

public class FkyingBird extends Birds{

        private String movement;

        public FkyingBird(String name,
                             int age,
                             String environment,
                             String movement) {
            super(name, age, environment, movement );
        }

        @Override
        public void eat() {
            System.out.println("летающая птица есть насекомых");

        }

        @Override
        public void sleep() {
            System.out.println("летающая птица спит ночью");

        }

        @Override
        public void go() {
            System.out.println("летающая хотит" + getMovement());

        }

        @Override
        public void hunt() {
            System.out.println("летающая птица охотиться на земле");

        }
}
