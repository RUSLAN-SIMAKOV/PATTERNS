package ruslan.simakov.bstrategy;

public class UserChecker {

    public void userCheck(AuthStrategy authStrategy) {
        String login = "";
        String password = "";
        authStrategy.checkAuth(login, password);
    }
}
