public class Cappuccino extends BaseCoffee {

    public Cappuccino(int coffeePortion, int waterPortion, int milkPortion) {
        super(coffeePortion, waterPortion, milkPortion);
    }


    @Override
    public void prepareCoffee(int coffeePortion, int waterPortion, int milkPortion) {

        coffeePortion = 1;
        waterPortion = 1;
        milkPortion = 2;

        System.out.println("Cappuccino portions: Coffee "+coffeePortion+" Milk "+milkPortion+" Water "+waterPortion);
    }

}
