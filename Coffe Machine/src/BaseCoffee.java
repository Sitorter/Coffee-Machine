abstract class BaseCoffee implements CoffeeMachine {

    private int coffeePortion;
    private int waterPortion;
    private int milkPortion;

    public BaseCoffee(int coffeePortion, int waterPortion, int milkPortion) {
        this.coffeePortion = coffeePortion;
        this.waterPortion = waterPortion;
        this.milkPortion = waterPortion;
    }

    @Override

    public abstract void  prepareCoffee(int coffeePortion, int waterPortion, int milkPortion);

}
