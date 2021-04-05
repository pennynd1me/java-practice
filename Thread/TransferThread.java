public class TransferThread extends Thread {
    SharedArea sharedArea;

    public TransferThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        synchronized (sharedArea) {
            for (int count = 0; count < 12; count++) {
                sharedArea.account1.withdraw(1000000);
                System.out.println("이몽룡 계좌 : 100만원 인출");
                sharedArea.account2.deposit(1000000);
                System.out.println("성춘향 계좌 : 100만원 입금");
            }
        }
    }
}
