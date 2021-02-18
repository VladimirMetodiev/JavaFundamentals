package Strings;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] data = input.nextLine().split("\\s+");

        String str1 = data[0], str2 = data[1];
        int sum = 0;

        for(int a = 0; a < (str1.length() >= str2.length() ? str1.length() : str2.length()); a++){
            try{
                sum += (int)str1.charAt(a) * (int)str2.charAt(a);
            }
            catch(Exception ex1){
                try{
                    sum += (int)str1.charAt(a);
                }
                catch(Exception ex2){
                    sum += (int)str2.charAt(a);
                }
            }
        }

        System.out.println(sum);
    }
}
