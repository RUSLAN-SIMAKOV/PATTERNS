package ruslan.simakov.sdecorator;

public class Egg implements Food{
    @Override
    public void cook() {
        System.out.println("Cooking eggs");
    }
}
