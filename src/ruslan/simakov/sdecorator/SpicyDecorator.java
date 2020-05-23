package ruslan.simakov.sdecorator;

public class SpicyDecorator extends Decorator{

    public SpicyDecorator(Food food) {
        super(food);
    }

    @Override
    public void afterCooking() {
        System.out.println("...adding spicy");
    }
}
