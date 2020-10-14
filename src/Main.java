public class Main {

    public static void main(String[] args) {

        Thread thread;
        for (int i = 1; i <= 10; i++) {
            thread = new Thread(new Potencial(i));
            if ((i % 2) == 0) {
                thread.setPriority(Thread.MAX_PRIORITY);
            } else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            thread.start();
        }

    }

}
