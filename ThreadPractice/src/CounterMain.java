public class CounterMain {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                Counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                Counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t1.join();

        System.out.println(Counter.getCount());

        // 200,000 - This should be the output
        //100, 000

    }
}
