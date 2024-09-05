package threads.example1;

public class Example1 {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("One");
        NewThread t2 = new NewThread("Two");
        NewThread t3 = new NewThread("Three");
        t1.start();
        t2.start();
        t3.start();

        System.out.println(t1.getName() + " alive status: " + t1.isAlive());
        System.out.println(t2.getName() + " alive status: " + t2.isAlive());
        System.out.println(t3.getName() + " alive status: " + t3.isAlive());

        try {
            System.out.println("wait for finish");
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted!");
        }

        System.out.println(t1.getName() + " alive status: " + t1.isAlive());
        System.out.println(t2.getName() + " alive status: " + t2.isAlive());
        System.out.println(t3.getName() + " alive status: " + t3.isAlive());
    }
}
