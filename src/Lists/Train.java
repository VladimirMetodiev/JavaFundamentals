package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> passengers = Arrays.stream(input.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        int capacity = Integer.parseInt(input.nextLine());

        String expression;
        String[] cmd = new String[2];
        int current = 0;

        while(!(expression = input.nextLine().toLowerCase()).equals("end")){
            if(expression.contains("add")){
                cmd = expression.split(" ");
                passengers.add(Integer.parseInt(cmd[1]));
            }
            else{
                current = Integer.parseInt(expression);
                for(int a = 0; a < passengers.size(); a++){
                    if(passengers.get(a) + current <= capacity){
                        current += passengers.get(a);
                        passengers.remove(a);
                        passengers.add(a, current);
                        break;
                    }
                }
            }
        }
        passengers.forEach(e -> System.out.print(e + " "));
    }
}
