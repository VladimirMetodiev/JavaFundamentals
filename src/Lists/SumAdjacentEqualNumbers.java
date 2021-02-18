package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> myNumbers = Arrays.stream(input.nextLine().split(" ")).map(e -> Double.parseDouble(e)).collect(Collectors.toList());

        DecimalFormat df = new DecimalFormat("0.####");

        int second = 0;

        for(int a = 1; a < myNumbers.size(); a = second){
            second = a;
            if(myNumbers.get(second).equals(myNumbers.get(second - 1))){
                myNumbers.set(second - 1, myNumbers.get(second) + myNumbers.get(second - 1));
                myNumbers.remove(second);
                second = 1;
            }
            else{
                second += 1;
            }
        }

        for(double number : myNumbers){
            System.out.print(df.format(number) + " ");
        }
    }
}
