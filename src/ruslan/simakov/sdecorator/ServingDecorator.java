package ruslan.simakov.sdecorator;

public class ServingDecorator extends Decorator{

    public ServingDecorator(Food food) {
        super(food);
    }

    @Override
    public void afterCooking() {
        System.out.println("...serving");
    }
}
