package org.example.Light;



public class Example3 {
    public static void main(String[] args){
        Light l = new Light();
        int days = 1000;
        String milesString = "It would take " + days + " days for light surpass " + l.getDistance(days);
        System.out.println(milesString);
        boolean b = false;
        int[] month_days = new int[12];
        month_days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    }
}
