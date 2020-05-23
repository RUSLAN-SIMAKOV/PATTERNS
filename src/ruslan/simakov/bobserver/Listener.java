package ruslan.simakov.bobserver;

public class Listener implements PublisherActionListener{

    @Override
    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getName());
    }
}
