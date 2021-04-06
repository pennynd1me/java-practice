public class GenericMethod {
    public <T> void showArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    public <T> T getLast(T[] array) {
        return array[array.length - 1];
    }
}
