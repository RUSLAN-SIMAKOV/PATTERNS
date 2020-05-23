package ruslan.simakov.bstate;

public class CarState implements TransformerState{

    @Override
    public void action() {
        System.out.println("Move");
    }
}
