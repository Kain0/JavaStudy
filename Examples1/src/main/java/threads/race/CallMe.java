package threads.race;

public class CallMe {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException е) {
            System.out.println("Interrupted");
        }
        System.out.println("] ");
    }
}
