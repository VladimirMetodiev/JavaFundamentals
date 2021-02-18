package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] keys = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(digit -> Integer.parseInt(digit)).toArray();

        StringBuilder decryptedMessage = new StringBuilder();
        String expression, treasure, location;
        char letter;
        int counter = 0;

        while(!(expression = input.nextLine()).equals("find")){
            for(int a = 0; a < expression.length(); a++){
                letter = (char)((int)expression.charAt(a) - keys[counter]);
                decryptedMessage.append(letter);

                counter++;
                if(counter < keys.length){
                    continue;
                }
                else{
                    counter = 0;
                }
            }

            int startPositionOfTreasure = decryptedMessage.indexOf("&") + 1;
            int lastPositionOfTreasure = decryptedMessage.lastIndexOf("&");
            int startPositionOfLocation = decryptedMessage.indexOf("<") + 1;
            int lastPositionOfLocation = decryptedMessage.lastIndexOf(">");

            treasure = decryptedMessage.substring(startPositionOfTreasure, lastPositionOfTreasure);
            location = decryptedMessage.substring(startPositionOfLocation, lastPositionOfLocation);
            System.out.printf("Found %s at %s%n", treasure, location);

            decryptedMessage.setLength(0);
            counter = 0;
        }
    }
}
