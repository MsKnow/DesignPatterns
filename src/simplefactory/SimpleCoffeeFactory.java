package simplefactory;

/**
 * Created by xiehao on 4/12/16.
 */
public class SimpleCoffeeFactory {
    private static volatile SimpleCoffeeFactory instance = null;

    private SimpleCoffeeFactory() {
    }

    public static SimpleCoffeeFactory getInstance() {
        if (null == instance) {
            synchronized (SimpleCoffeeFactory.class) {
                if (null == instance) {
                    instance = new SimpleCoffeeFactory();
                }
            }
        }
        return instance;
    }

    /*public Coffee createCoffee(String type) {
        Coffee coffee;
        switch (type) {
            case "latte":
                coffee = new LatteCoffee();
                break;
            case "espresso":
                coffee = new EspressoCoffee();
                break;
            default:
                coffee = new NullCoffee();
                break;
        }
        return coffee;
    }*/
}
