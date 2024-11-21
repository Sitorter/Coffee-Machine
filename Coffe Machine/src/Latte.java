public class Latte extends BaseCoffee {

    public Latte(int coffeePortion, int waterPortion, int milkPortion) {
        super(coffeePortion, waterPortion, milkPortion);
    }


    @Override
    public void prepareCoffee(int coffeePortion, int waterPortion, int milkPortion) {

        coffeePortion = 2;
        waterPortion = 1;
        milkPortion = 1;

        System.out.println("Latte portions: Coffee "+coffeePortion+" Milk "+milkPortion+" Water "+waterPortion);
    }

}
