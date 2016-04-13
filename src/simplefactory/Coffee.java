package simplefactory;

/**
 * Created by xiehao on 4/12/16.
 */
public abstract class Coffee {
    protected String name = "";
    protected boolean hasSugar = false;

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing coffee beans...");
    }

    public void brew() {
        System.out.println("Brewing coffee...");
    }

    public void pour() {
        System.out.println("Pouring coffee into the cup...");
    }

    public void addSugar() {
        System.out.println("Adding sugar...");
    }

    @Override
    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        if (hasSugar) {
            display.append("with sugar.\n");
        } else {
            display.append("without sugar.\n");
        }
        return display.toString();
    }
}
