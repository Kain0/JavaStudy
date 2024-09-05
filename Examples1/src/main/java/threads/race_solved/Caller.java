package threads.race_solved;

public class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);

    }

    @Override
    public void run() {
        target.call(msg);
    }
}
