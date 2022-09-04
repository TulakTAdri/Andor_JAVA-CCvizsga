import java.util.ArrayList;
import java.util.List;

public class Espresso extends CoffeeType {
    @Override
    public List<String> getIngredients() {
        List<String> espressoIngredients = new ArrayList<>();
        espressoIngredients.add("Coffee");
        espressoIngredients.add("Sugar");

        return espressoIngredients;
    }
}
