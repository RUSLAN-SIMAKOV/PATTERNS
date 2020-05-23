package ruslan.simakov.bstrategy;

public interface AuthStrategy {

    void checkAuth(String login, String password);
}
