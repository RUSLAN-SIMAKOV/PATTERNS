package ruslan.simakov.bstrategy;

public class DBAuth implements AuthStrategy{

    @Override
    public void checkAuth(String login, String password) {
        System.out.println("DB Auth");
    }
}
