package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> distances = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int index, value = 0;
        long sum = 0L;

        // distances.size() > 0 <=> празен списък

        while (distances.size() > 0){
            index = Integer.parseInt(input.nextLine());

            if(index < 0){
                value = distances.get(0);
                distances.set(0, distances.get(distances.size() - 1));
            }
            else if(index > distances.size() - 1){
                value = distances.get(distances.size() - 1);
                distances.set(distances.size() - 1, distances.get(0));
            }
            else{
                value = distances.get(index);
                distances.remove(index);
            }

            sum += value;

            for(int a = 0; a < distances.size(); a++){
                if(distances.get(a) <= value){
                    distances.set(a, distances.get(a) + value);
                }
                else if(distances.get(a) > value){
                    distances.set(a, distances.get(a) - value);
                }
            }
        }

        System.out.println(sum);
    }
}
