package MethodAssignment;

public class OddNumBetweenAandB {
    public void OddPrint(int x , int y){
        for (int i = x ; i <= y; i++){
            if (i % 2 == 0)continue;
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        OddNumBetweenAandB sc = new OddNumBetweenAandB();
        sc.OddPrint(3,20);

    }
}
