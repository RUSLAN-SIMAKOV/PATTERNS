package ruslan.simakov.csingleton;

public class Singleton {

    private static Singleton instance;
    //private static final Singleton instance = new Singleton();;

    private Singleton(){
        System.out.println("Singleton");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
