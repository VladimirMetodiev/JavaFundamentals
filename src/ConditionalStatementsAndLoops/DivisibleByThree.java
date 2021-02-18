package ConditionalStatementsAndLoops;

public class DivisibleByThree {
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a++) {
            if(a % 3 == 0)
            {
                System.out.println(a);
            }
        }
    }
}
