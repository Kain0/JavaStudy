package threads.example1;

public class NewThread implements Runnable {

    private String name;
    private Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted!");
        }
        System.out.println(name + " finished");
    }

    public String getName() {
        return name;
    }
    public void start(){
        t.start();
    }

    public boolean isAlive(){
        return t.isAlive();
    }

    public void join() throws InterruptedException {
        t.join();

    }
}
