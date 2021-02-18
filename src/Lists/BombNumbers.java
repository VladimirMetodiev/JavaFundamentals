package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> sequence = Arrays.stream(input.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        int[] bombNumber = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;

        for (int a = 0; a < sequence.size(); a++){
            if(sequence.get(a) == bombNumber[0]){
                for (int b = bombNumber[1]; b > 0; b--){
                    if(a - b >= 0){
                        sequence.remove(a - b);
                        a--;
                    }
                }
                for (int c = bombNumber[1]; c > 0; c--){
                    if(a + c < sequence.size()){
                        sequence.remove(a + c);
                    }
                }
                sequence.remove(a);
                a--;
            }

        }

        for(int d = 0; d < sequence.size(); d++){
            sum += sequence.get(d);
        }

        System.out.println(sum);
    }
}
