public class MultiThreadEx5 {

    public static void main(String[] args) {
        SharedArea area = new SharedArea();

        area.account1 = new Account("1111-111", "이몽룡", 20000000);
        area.account2 = new Account("1111-222", "성춘향", 10000000);

        Thread thread1 = new TransferThread(area);
        Thread thread2 = new PrintThread(area);

        thread1.start();
        thread2.start();
    }
}
