package MethodAssignment;

public class TakeRandReturnA {
    public double Area(int r){
        double a = 3.14*r*r;
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        TakeRandReturnA sc = new TakeRandReturnA();
        sc.Area(10);
    }
}
