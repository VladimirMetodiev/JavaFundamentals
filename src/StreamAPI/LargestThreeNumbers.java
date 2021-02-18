package StreamAPI;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> threeOfThem = Arrays.stream(input.nextLine().split("\\s+"))
                .map(num -> Integer.parseInt(num))
                .sorted((num1, num2) -> num2.compareTo(num1))
                .collect(Collectors.toList());

        for(int a = 0; a < ((threeOfThem.size() < 3) ? threeOfThem.size() : 3); a++){
            System.out.print(threeOfThem.get(a) + " ");
        }
    }
}
