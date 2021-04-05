public class PrintThread extends Thread {
    SharedArea sharedArea;

    PrintThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        synchronized (sharedArea) {
            for (int i = 0; i < 3; i++) {
                int sum = sharedArea.account1.balance + sharedArea.account2.balance;
                System.out.println("계좌잔액합계: " + sum);
            }
        }
    }
}
