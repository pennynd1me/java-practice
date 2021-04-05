public class MultiThreadEx2 {

    public static void main(String[] args) {
        DigitThread2 obj = new DigitThread2();
        Thread thread = new Thread(obj);
        //Thread thread = new Thread(new DigitThread2());a
        thread.start();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}
