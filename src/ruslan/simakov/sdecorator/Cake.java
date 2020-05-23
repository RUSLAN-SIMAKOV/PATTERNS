package ruslan.simakov.sdecorator;

public class Cake implements Food{
    @Override
    public void cook() {
        System.out.println("Cooking cake");
    }
}
