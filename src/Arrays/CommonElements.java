package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] firstArray = input.nextLine().split(" ");
        String[] secondArray = input.nextLine().split(" ");

        for(int a = 0; a < firstArray.length; a++){
            for(int b = 0; b < secondArray.length; b++){
                if(firstArray[a].equals(secondArray[b])){
                    System.out.print(firstArray[a] + " ");
                }
            }
        }
    }
}
