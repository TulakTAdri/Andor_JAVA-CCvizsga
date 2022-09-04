import java.util.ArrayList;
import java.util.List;

public class Americano extends CoffeeType {
    @Override
    public List<String> getIngredients() {
        List<String> americanoIngredients = new ArrayList<>();
        americanoIngredients.add("Coffee");
        americanoIngredients.add("Water");
        americanoIngredients.add("Sugar");

        return americanoIngredients;
    }
}
