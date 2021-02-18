package Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String expression = input.nextLine();

        LinkedHashMap<Character, Integer> frequency = new LinkedHashMap<>();

        for(int a = 0; a < expression.length(); a++){
            char current = expression.charAt(a);

            if(current != (char)32){
                if(!frequency.containsKey(current)){
                    frequency.put(current, 1);
                }
                else{
                    int lastNumber = frequency.get(current);
                    frequency.put(current, lastNumber + 1);
                }
            }
            else{
                continue;
            }
        }

        for(Map.Entry<Character, Integer> letter : frequency.entrySet()){
            System.out.printf("%c -> %d%n", letter.getKey(), letter.getValue());
        }
    }
}
