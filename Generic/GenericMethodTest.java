public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Character[] characters = {'A', 'P', 'P', 'L', 'E'};

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.<Character>showArray(characters); // 구체적 타입을 생략해도 된다. (IntelliJ에서 잡아줌)
        System.out.println();
        genericMethod.showArray(integers); // 구체적 타입을 생략해도 된다.
        System.out.println();
        System.out.println(genericMethod.getLast(integers));
    }
}
