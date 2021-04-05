public class DigitThread extends Thread {

    public void run() {
        for (int count = 0; count < 100; count++) {
            System.out.print(count + " ");
        }
    }
}
