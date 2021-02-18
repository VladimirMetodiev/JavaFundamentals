package ObjectsAndClasses;

import java.math.BigInteger;
        import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger a = new BigInteger(input.nextLine());
        BigInteger b = new BigInteger(input.nextLine());

        Addition summing = new Addition();

        summing.sum(a, b);
    }
}

class Addition{
    void sum(BigInteger a, BigInteger b){
        BigInteger newSum = a.add(b);
        System.out.println(newSum);
    }
}
