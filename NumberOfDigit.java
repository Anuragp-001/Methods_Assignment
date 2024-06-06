package MethodAssignment;

public class NumberOfDigit {
    public void Digits(int n){
        int i = 0;
        while (n != 0){
            n = n / 10;
            i = i +1;
        }
        System.out.println(i);
        System.out.println(i*i);
    }

    public static void main(String[] args) {
        NumberOfDigit sc = new NumberOfDigit();
        sc.Digits(1000);
    }
}
