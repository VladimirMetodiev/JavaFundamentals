package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int a = 0; a < numbers.size(); a++) {
            if(numbers.get(a) < 0){
                numbers.remove(a);
                a = a - 1;
            }
        }

        //numbers.removeIf(e -> e < 0);
        //От списъкът numbers премахни всички (е - всички), които са по-малки от нула

        Collections.reverse(numbers);

        if(numbers.isEmpty()){
            System.out.println("empty");
        }
        else{
            numbers.forEach(e -> System.out.print(e + " "));
        }
    }
}

