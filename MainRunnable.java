// Implementing Runnable interface

class GoodMorningRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning");
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Hello");
                Thread.sleep(2000); // Sleep for 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class WelcomeRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Welcome................\n");
                Thread.sleep(3000); // Sleep for 3 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class MainRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new GoodMorningRunnable());
        Thread t2 = new Thread(new HelloRunnable());
        Thread t3 = new Thread(new WelcomeRunnable());

        t1.start();
        t2.start();
        t3.start();
    }
}
