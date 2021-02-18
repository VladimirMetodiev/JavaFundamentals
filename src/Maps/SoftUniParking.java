package Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        LinkedHashMap<String, String> checkOff = new LinkedHashMap<>();
        LinkedHashMap<String, String> personalData = new LinkedHashMap<>();

        String[] expression;

        for(int a = 0; a < number; a++){
            expression = input.nextLine().split("\\s+");

            if(expression[0].equals("register") && !personalData.containsKey(expression[1])){
                personalData.put(expression[1], expression[2]);
            }

            if(expression[0].equals("register") && personalData.containsKey(expression[1]) && !personalData.containsValue(expression[2])){
                System.out.printf("ERROR: already registered with plate number %s%n", personalData.get(expression[1]));
                continue;
            }

            if(!checkOff.containsKey(expression[1])&& expression[0].equals("register")){
                checkOff.put(expression[1], expression[0]);
                System.out.printf("%s registered %s successfully%n", expression[1], expression[2]);
                continue;
            }
            else if(!checkOff.containsKey(expression[1])&& expression[0].equals("unregister")){
                System.out.printf("ERROR: user %s not found%n", expression[1]);
                continue;
            }

            if(checkOff.get(expression[1]).equals("register") && expression[0].equals("register")){
                System.out.printf("ERROR: already registered with plate number %s%n", personalData.get(expression[1]));
                continue;
            }
            else if(checkOff.get(expression[1]).equals("register") && expression[0].equals("unregister")){
                checkOff.put(expression[1], expression[0]);
                System.out.printf("%s unregistered successfully%n", expression[1]);
            }

            if(checkOff.get(expression[1]).equals("unregister") && expression[0].equals("register")){
                checkOff.put(expression[1], expression[0]);
                System.out.printf("%s registered %s successfully%n", expression[1], expression[2]);
            }

        }

        for(Map.Entry<String, String> registeredUser : checkOff.entrySet()){
            for(Map.Entry<String, String> personalInformation : personalData.entrySet()){
                if(registeredUser.getKey().equals(personalInformation.getKey()) && registeredUser.getValue().equals("register")){
                    System.out.printf("%s => %s%n", personalInformation.getKey(), personalInformation.getValue());
                }
            }
        }
    }
}


//Input:

//6
//register Jacob MM1111XX
//register Anthony AB1111XX
//unregister Jacob
//register Joshua DD1111XX
//unregister Lily
//register Samantha AA9999BB

//Output:

//Jacob registered MM1111XX successfully
//Anthony registered AB1111XX successfully
//Jacob unregistered successfully
//Joshua registered DD1111XX successfully
//ERROR: user Lily not found
//Samantha registered AA9999BB successfully
//Anthony => AB1111XX
//Joshua => DD1111XX
//Samantha => AA9999BB

