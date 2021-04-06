public class GenericQuiz {
    public static void main(String[] args) {
        Gprint gprint = new Gprint();
        Integer a = gprint.input(3);
        String b = gprint.input("안녕");
        Double c = gprint.input(3.0);
//        Double c = gprint.input(1); // 컴파일 에러
        System.out.println(a + " " + b + " " + c);

    }
}

class Gprint {
    <T> T input(T t) {
        return t;
    }
}
