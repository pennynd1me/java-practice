public class GenericCup<T extends Beverage> { // Beverage 및 자식 타입으로만 제한
    private T beverage;

    public T getBeverage() {
        return beverage;
    }

    public void setBeverage(T beverage) {
        this.beverage = beverage;
    }
}
