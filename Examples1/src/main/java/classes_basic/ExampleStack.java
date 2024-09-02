package classes_basic;

import java.util.ArrayList;

public class ExampleStack {


    public static void main(String[] args) {
        ArrayList<Integer> prev = new ArrayList<>();
        prev.add(1);
        prev.add(3);
        Stack<Integer> s = new Stack<>(prev);
        System.out.println(s);

        for (int i = 0; i < 10; ++i) {
            s.push(i);
        }
        System.out.println(s);
        System.out.println(s.size());
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        System.out.println(s);
    }
}
