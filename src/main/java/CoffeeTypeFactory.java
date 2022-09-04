public class CoffeeTypeFactory {

    public CoffeeType create(int pressedButtonNumber) {

        switch (pressedButtonNumber) {
            case 1:
                return new Espresso();
            case 2:
                return new Cappuccino();
            case 3:
                return new Americano();
            default:
                throw new IllegalArgumentException();
        }

    }
}
