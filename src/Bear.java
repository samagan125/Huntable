public class Bear extends Predator implements Huntable{
    public Bear(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void hunt() {
        System.out.println("lion is huntint");

    }
}
