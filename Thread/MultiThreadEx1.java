public class MultiThreadEx1 {

    public static void main(String[] args) { // main
        Thread thread = new DigitThread();
        thread.start();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}
