package classes_basic;

public class Example1 {

    public static void main(String[] args) {
        Box b = new Box();
        Box a = new Box(1, 2, 3);
        System.out.println(b.getVolume());
        System.out.println(a.getVolume());
    }
}
