package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> partyGoers = new ArrayList<String>();
        String expression, name;
        boolean isAtAParty = false;

        int number = Integer.parseInt(input.nextLine());

        for(int a = 0; a < number; a++){
            expression = input.nextLine();
            int indexOfSpace = expression.indexOf(" ");
            name = expression.substring(0, indexOfSpace);

            if(expression.contains("is going")){
                for(int b = 0; b < partyGoers.size(); b++){
                    if(partyGoers.get(b).equals(name)){
                        System.out.printf("%s is already in the list!%n", name);
                        isAtAParty = true;
                    }
                }
                if(isAtAParty == false){
                    partyGoers.add(name);
                }
            }
            else if(expression.contains("is not going")){
                for(int b = 0; b < partyGoers.size(); b++){
                    if(partyGoers.get(b).equals(name)){
                        partyGoers.remove(name);
                        isAtAParty = true;
                    }
                }
                if(isAtAParty == false){
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
            if(isAtAParty == true){
                isAtAParty = false;
            }
        }

        partyGoers.forEach(e -> System.out.println(e + " "));
    }
}
