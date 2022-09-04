import java.util.ArrayList;
import java.util.List;

public class Cappuccino extends CoffeeType {
    @Override
    public List<String> getIngredients() {
        List<String> cappuccinoIngredients = new ArrayList<>();
        cappuccinoIngredients.add("Coffee");
        cappuccinoIngredients.add("Milk");
        cappuccinoIngredients.add("Sugar");

        return cappuccinoIngredients;
    }
}
