package ruslan.simakov.bstate;

public class RobotState implements TransformerState{

    @Override
    public void action() {
        System.out.println("Fire");
    }
}
