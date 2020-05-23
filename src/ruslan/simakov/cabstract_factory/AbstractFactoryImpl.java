package ruslan.simakov.cabstract_factory;


public class AbstractFactoryImpl implements AbstractFactory {

    @Override
    public Eat getEat() {
        if (Math.random() < 0.5) {
            return new Chocolate();
        }
        return new Cookie();
    }

    @Override
    public Drink getDrink() {
        if (Math.random() < 0.5) {
            return new Tea();
        }
        return new Coffee();
    }
}
