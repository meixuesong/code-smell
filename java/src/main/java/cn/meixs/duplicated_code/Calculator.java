package cn.meixs.duplicated_code;

public class Calculator {
    private int[] arrayA;
    private int[] arrayB;

    public Calculator(int[] arrayA, int[] arrayB) {
        this.arrayA = arrayA;
        this.arrayB = arrayB;
    }

    public int sum() {
        int sumA = 0;
        for (int i = 0; i < arrayA.length; i++) {
            sumA = sumA + arrayA[i];
        }

        int sumB = 0;
        for (int i = 0; i < arrayB.length; i++) {
            sumB = sumB + arrayB[i];
        }

        return sumA + sumB;
    }
}
