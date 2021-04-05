public class DigitThread2 implements Runnable {

    @Override
    public void run() {
        for (int count = 0; count < 100; count++) {
            System.out.print(count + " ");
        }
    }
}
