package inheritance.Example1;

public class Access {

    public static void main(String[] args){
        B subObj = new B();
        subObj.setij(10, 12);

        subObj.sum();
        System.out.println("Сумма равна " + subObj.total);
    }
}
