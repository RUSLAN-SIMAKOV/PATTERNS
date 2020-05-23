package ruslan.simakov;

import ruslan.simakov.bobserver.Listener;
import ruslan.simakov.bobserver.Publisher;
import ruslan.simakov.bobserver.Subscriber;
import ruslan.simakov.bstate.CarState;
import ruslan.simakov.bstate.RobotState;
import ruslan.simakov.bstate.TransformerContext;
import ruslan.simakov.bstate.TransformerState;
import ruslan.simakov.bstrategy.AuthStrategy;
import ruslan.simakov.bstrategy.DBAuth;
import ruslan.simakov.bstrategy.FileAuth;
import ruslan.simakov.bstrategy.UserChecker;
import ruslan.simakov.cabstract_factory.AbstractFactory;
import ruslan.simakov.cabstract_factory.AbstractFactoryImpl;
import ruslan.simakov.cfactory_method.DrinkSelector;
import ruslan.simakov.csingleton.Singleton;
import ruslan.simakov.sadapter.Adapter;
import ruslan.simakov.sdecorator.*;
import ruslan.simakov.sfacad.Facad;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Singleton.getInstance();

        DrinkSelector.getDrink();

        AbstractFactory abstractFactory = new AbstractFactoryImpl();
        abstractFactory.getDrink();
        abstractFactory.getEat();

        Food egg = new Egg();
        egg.cook();
        Food cake = new ServingDecorator(new Cake());
        cake.cook();
        Food egg2 = new SpicyDecorator(new ServingDecorator(new Egg()));
        egg2.cook();

        List<String> book = new ArrayList<>();
        Adapter printBook = new Adapter();
        printBook.print(book);

        Facad breakfast = new Facad();
        breakfast.makingBreakfast();

        Listener listener = new Listener();
        Subscriber subscriber = new Subscriber();
        Publisher publisher = new Publisher();
        publisher.addListener(listener);
        publisher.addListener(subscriber);
        publisher.createNewMessage("Matrix");

        TransformerState carState = new CarState();
        TransformerState robotState = new RobotState();
        TransformerContext context = new TransformerContext();
        context.setTransformerState(carState);
        context.action();
        context.setTransformerState(robotState);
        context.action();

        UserChecker userChecker = new UserChecker();
        AuthStrategy dbAuth = new DBAuth();
        AuthStrategy fileAuth = new FileAuth();
        userChecker.userCheck(dbAuth);
        userChecker.userCheck(fileAuth);
    }
}
