package Maps;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Cars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<String, ArrayList<String>> cars = new TreeMap<>();

        String expression;
        String[] data;

        while(!(expression = input.nextLine()).equals("end")){
            data = expression.split("\\s+");
            String brand = data[0];
            String model = data[1];

            //Проверявам дали в асоциативният масив cars съществува ключа brand, ако не съществува създавам нов списък
            if(!cars.containsKey(brand)){
                cars.put(brand, new ArrayList<>());
            }

            //От асоциативният масив cars взимам ключа brand и добавям model
            cars.get(brand).add(model);
        }

        for(Map.Entry<String, ArrayList<String>> modelsOfTheBrand : cars.entrySet()){
            System.out.printf(">>> %s%n", modelsOfTheBrand.getKey());
            for(String mods : modelsOfTheBrand.getValue()){
                System.out.printf(" - %s%n", mods);
            }
        }
    }
}

//Input:

//Mercedes-Benz A-Class
//BMW BMW1
//BMW BMW5
//Mercedes-Benz B-Class
//Mercedes-Benz EQC
//BMW BMW7
//Mercedes-Benz G-Class
//BMW BMW-X1
//BMW BMW8
//BMW BMW3
//BMW BMW2
//Mercedes-Benz C-Class
//BMW BMW4
//Mercedes-Benz CLA
//BMW BMW6
//Mercedes-Benz CLS
//Mercedes-Benz E-Class
//end


