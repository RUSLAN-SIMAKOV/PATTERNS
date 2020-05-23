package ruslan.simakov.bstrategy;

public class FileAuth implements AuthStrategy{

    @Override
    public void checkAuth(String login, String password) {
        System.out.println("File Auth");
    }
}
