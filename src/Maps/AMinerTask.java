package Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int counter = 0;
        String expression, currentResource = "";
        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        while(!(expression = input.nextLine()).equals("stop")){
            counter++;

            if(counter % 2 != 0){
                currentResource = expression;
                resources = getsResources(resources, expression);
            }
            else{
                resources = getsQuantity(resources, currentResource, Integer.parseInt(expression));
            }
        }

        for(Map.Entry<String, Integer> stuff : resources.entrySet()){
            System.out.printf("%s -> %d%n", stuff.getKey(), stuff.getValue());
        }
    }

    public static LinkedHashMap<String, Integer> getsResources(LinkedHashMap<String, Integer> res, String exp){
        if(!res.containsKey(exp)){
            res.put(exp, 0);
        }
        return res;
    }

    public static LinkedHashMap<String, Integer> getsQuantity(LinkedHashMap<String, Integer> res, String currentRes, int quantity){
        int lastQuantity = res.get(currentRes);
        res.put(currentRes, lastQuantity + quantity);
        return res;
    }
}
