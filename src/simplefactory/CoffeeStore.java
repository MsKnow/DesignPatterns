package simplefactory;

/**
 * Created by xiehao on 4/12/16.
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.getInstance().createCoffee(type);
        coffee.prepare();
        coffee.brew();
        coffee.pour();
        coffee.addSugar();
        return coffee;
    }
}
