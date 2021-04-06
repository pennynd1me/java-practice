public class Cup {
    //모든 종류의 객체를 컵에 담을 수 있도록 Object 타입 사용
    private Object beverage;

    public Object getBeverage() {
        return beverage;
    }

    public void setBeverage(Object beverage) {
        this.beverage = beverage;
    }
}
