package adapter;

public class Adapter {


    interface Bird {
        void fly();
        void makeSound();
    }

    static class Sparrow implements Bird {

        public void fly() {
            System.out.println("Flying");
        }

        public void makeSound() {
            System.out.println("Chirp Chirp");
        }
    }

    interface ToyDuck {
        void squeak();
    }

    static class PlasticToyDuck implements ToyDuck {
        public void squeak() {
            System.out.println("Squeak");
        }
    }

    static class BirdAdapter implements ToyDuck {
        Bird bird;

        public BirdAdapter(Bird bird) {
            this.bird = bird;
        }

        public void squeak() {
            bird.makeSound();
        }
    }


        public static void main(String args[]) {
            Sparrow sparrow = new Sparrow();
            ToyDuck toyDuck = new PlasticToyDuck();

            // Wrap a bird in a birdAdapter so that it
            // behaves like toy duck
            ToyDuck birdAdapter = new BirdAdapter(sparrow);

            System.out.println("Sparrow...");
            sparrow.fly();
            sparrow.makeSound();

            System.out.println("ToyDuck...");
            toyDuck.squeak();

            // toy duck behaving like a bird
            System.out.println("BirdAdapter...");
            birdAdapter.squeak();
        }

}
