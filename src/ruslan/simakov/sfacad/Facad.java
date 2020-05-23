package ruslan.simakov.sfacad;

public class Facad {
    Egg egg = new Egg();
    Coffee coffee = new Coffee();

    public void makingBreakfast() {
        egg.cooking();
        coffee.cooking();
    }
}
