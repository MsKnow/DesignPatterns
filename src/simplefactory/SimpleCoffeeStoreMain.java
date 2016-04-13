package simplefactory;

/**
 * Created by xiehao on 4/12/16.
 */
public class SimpleCoffeeStoreMain {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        System.out.println("=================================================");
        Coffee coffee = store.orderCoffee("espresso");
        System.out.println("I ordered a cup of " + coffee.getName()
                + " coffee.");
        System.out.println(coffee);
        System.out.println();
        System.out.println("=================================================");
        coffee = store.orderCoffee("latte");
        System.out.println("U ordered a cup of " + coffee.getName()
                + " coffee.");
        System.out.println(coffee);
        System.out.println();
    }
}
