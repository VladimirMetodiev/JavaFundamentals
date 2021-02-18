package Lambda;

import java.util.Scanner;
import java.util.function.Function;

public class LambdaExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Function<Integer, Boolean> theFirstLambdaExample = (a -> a > 11);
        System.out.println(theFirstLambdaExample.apply(Integer.parseInt(input.nextLine())));
    }
}
