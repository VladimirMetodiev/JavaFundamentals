package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> rowOfNumbers = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for(int a = 0; a < rowOfNumbers.size() / 2; a++){
            System.out.printf("%d ", rowOfNumbers.get(a) + rowOfNumbers.get(rowOfNumbers.size() - 1 - a));
        }

        if(rowOfNumbers.size() % 2 != 0){
            System.out.println(rowOfNumbers.get(rowOfNumbers.size() / 2));
        }
    }
}