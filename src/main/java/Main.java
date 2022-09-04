public class Main {
    public static void main(String[] args) {
        CoffeeTypeFactory coffeeTypeFactory = new CoffeeTypeFactory();
        CoffeeType espresso = coffeeTypeFactory.create(1);
        CoffeeType cappuccino = coffeeTypeFactory.create(2);
        CoffeeType americano = coffeeTypeFactory.create(3);

        int pressedButton = 4;

        switch (pressedButton) {
            case 1 -> System.out.println(espresso.getIngredients());
            case 2 -> System.out.println(cappuccino.getIngredients());
            case 3 -> System.out.println(americano.getIngredients());
            default -> System.out.println("Error");
        }

    }
}
