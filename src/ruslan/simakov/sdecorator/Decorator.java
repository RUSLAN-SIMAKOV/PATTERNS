package ruslan.simakov.sdecorator;

public abstract class Decorator implements Food{

    protected Food food;

    public Decorator(Food food) {
        this.food = food;
    }

    public abstract void afterCooking();

    @Override
    public void cook() {
        food.cook();
        afterCooking();
    }
}
