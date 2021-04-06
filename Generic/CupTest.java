public class CupTest {
    public static void main(String[] args) {
        Cup cup = new Cup();

        cup.setBeverage(new Beer());
        cup.setBeverage(new Boricha());

        Beer beer = (Beer) cup.getBeverage();
        //실행 시 ClassCastException 발생. 보리차를 맥주로 변환할 수 없음.
    }
}
