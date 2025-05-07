public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Gaju" + e);
            }
        }

    }
}
