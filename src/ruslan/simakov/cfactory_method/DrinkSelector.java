package ruslan.simakov.cfactory_method;

public class DrinkSelector {

    public static Drink getDrink(){
        if (Math.random() < 0.5){
            return new Tea();
        }
        return new Coffee();
    }
}
