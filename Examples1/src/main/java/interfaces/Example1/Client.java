package interfaces.Example1;


public class Client implements Callback {

    @Override
    public void callback() {
        System.out.println("callback!");
    }
}
