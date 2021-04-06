public class NewExample {
    public static void main(String[] args) {
        ClothingInfo2 obj = new ClothingInfo2("1234", Season.SUMMER);
        System.out.println("상품코드 = " + obj.code + " 계절구분 = " + obj.season);
        System.out.println(Season.SUMMER);

        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
