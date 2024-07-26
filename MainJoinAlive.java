class MyThread extends Thread {
    private String threadName;
    private int sleepTime;

    MyThread(String n, int t) {
        this.threadName = n;
        this.sleepTime = t;
    }

    public void run() {
        try {
            System.out.println(threadName + " is starting.");
            Thread.sleep(sleepTime);
            System.out.println(threadName + " is ending.\n");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class MainJoinAlive {
    public static void main(String[] args) {

        // Create an array of threads with different names and sleep times
        MyThread[] threads = new MyThread[]{
            new MyThread("Thread 1", 2000),
            new MyThread("Thread 2", 3000),
            new MyThread("Thread 3", 1000)
        };

        // Start each thread
        for (MyThread x : threads) {
            x.start();
        }


        // Check if threads are alive and wait for them to finish
        for (int i = 1; i <= threads.length; i++) {
            MyThread thread = threads[i];
            try {
                System.out.println("Is " + thread.getName() + " alive? " + thread.isAlive());
                thread.join();
                System.out.println(thread.getName() + " has finished.");
                System.out.println("Is " + thread.getName() + " alive? " + thread.isAlive());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Main thread has finished.");
    }
}
