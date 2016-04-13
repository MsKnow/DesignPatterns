package simplefactory;

/**
 * Created by xiehao on 4/12/16.
 */
public class LatteCoffee extends Coffee {
    public LatteCoffee() {
        name = "Latte";
        hasSugar = false;
    }

    @Override
    public void addSugar() {
        System.out.println("We do not add sugar...");
    }
}
