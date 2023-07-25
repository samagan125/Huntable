public class Volf extends Predator implements Huntable{
    public Volf(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void hunt() {
        System.out.println("lion is hunting");

    }
}
