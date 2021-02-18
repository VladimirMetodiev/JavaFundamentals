package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> player1 = Arrays.stream(input.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        List<Integer> player2 = Arrays.stream(input.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        while(player1.size() > 0 && player2.size() > 0){
            if(player1.get(0).equals(player2.get(0))){
                player1.remove(0);
                player2.remove(0);
            }
            else if(player1.get(0) > player2.get(0)){
                player1.add(player1.get(0));
                player1.remove(0);
                player1.add(player2.get(0));
                player2.remove(0);
            }
            else if(player1.get(0) < player2.get(0)){
                player2.add(player2.get(0));
                player2.remove(0);
                player2.add(player1.get(0));
                player1.remove(0);
            }
        }

        int sum = 0;

        if(player1.size() > player2.size()){
            for(int a = 0; a < player1.size(); a++){
                sum += player1.get(a);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
        else{
            for(int b = 0; b < player2.size(); b++){
                sum += player2.get(b);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}

//Земених player1.get(0) == player2.get(0) с player1.get(0).equals(player2.get(0))

