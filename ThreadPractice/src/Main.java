public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
     t1.setName("Gaju");
     t1.start();
        t1.setName("Queen");
        t1.start();
    }
}