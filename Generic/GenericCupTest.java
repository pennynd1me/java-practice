public class GenericCupTest {
    public static void main(String[] args) {
        GenericCup<Beer> genericCup = new GenericCup<>();
        genericCup.setBeverage(new Beer());
        Beer beer = genericCup.getBeverage(); // 형변환 불필요

//        genericCup.setBeverage(new Boricha()); // 컴파일 에러
        beer = genericCup.getBeverage();

        GenericCup<Beverage> beverageGenericCup = new GenericCup<>();
        beverageGenericCup.setBeverage(new Beer());
        beverageGenericCup.setBeverage(new Boricha());

        Boricha boricha = (Boricha) beverageGenericCup.getBeverage();
    }
}
