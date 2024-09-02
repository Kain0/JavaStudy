package org.example;

public class Example2 {
    public static void main(String[] args){
        int x;
        x = 100;
        System.out.println("Num's value:" + x);
        x = x * 2;
        System.out.println("Num * 2 = " + x);
        int y = 2000;
        if (x < y){
            System.out.println("x < y");
        }
        else {
            System.out.println("x >= y");
        }
        for (int i = 0; i < 10; ++i){
            System.out.println(i);
        }

    }
}
