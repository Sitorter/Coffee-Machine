public class Espresso extends BaseCoffee {

    public Espresso(int coffeePortion, int waterPortion, int milkPortion) {
        super(coffeePortion, waterPortion, milkPortion);
    }


    @Override
    public void prepareCoffee(int coffeePortion, int waterPortion, int milkPortion) {

        coffeePortion = 2;
        waterPortion = 1;
        milkPortion = 0;

        System.out.println("Espersso portions: Coffee "+coffeePortion+" Milk "+milkPortion+" Water "+waterPortion);
    }

}
