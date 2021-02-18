package Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Orders {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String expression = input.nextLine();
        LinkedHashMap<String, Double> prices = new LinkedHashMap<>();
        LinkedHashMap<String, Double> quantity = new LinkedHashMap<>();
        LinkedHashMap<String, Double> cost = new LinkedHashMap<>();

        while(!expression.equals("buy")){
            String[] data = expression.split("\\s+");

            prices.putIfAbsent(data[0], 0.0);

            quantity.putIfAbsent(data[0], 0.0);

            prices.put(data[0], Double.parseDouble(data[1]));

            double lastQuantity = quantity.get(data[0]);
            quantity.put(data[0], lastQuantity + Double.parseDouble(data[2]));

            expression = input.nextLine();
        }

        for(Map.Entry<String, Double> products : quantity.entrySet()){
            cost.put(products.getKey(), products.getValue());
        }

        for(Map.Entry<String, Double> price : prices.entrySet()){
            double totalValue = cost.get(price.getKey()) * price.getValue();
            cost.put(price.getKey(), totalValue);
            totalValue = 0.0;
        }

        for(Map.Entry<String, Double> printsTotalValue : cost.entrySet()){
            System.out.printf("%s -> %.2f%n", printsTotalValue.getKey(), printsTotalValue.getValue());
        }
    }
}


//Input:

//Beer 2.40 350
//Water 1.25 200
//IceTea 5.20 100
//Beer 1.20 200
//IceTea 0.50 120
//buy

//Output

//Beer -> 660,00
//Water -> 250,00
//IceTea -> 110,00



//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        String expression = input.nextLine();
//        LinkedHashMap<String, Double> prices = new LinkedHashMap<>();
//        LinkedHashMap<String, Double> quantity = new LinkedHashMap<>();
//        LinkedHashMap<String, Double> cost = new LinkedHashMap<>();
//
//        while(!expression.equals("buy")){
//            String[] data = expression.split("\\s+");
//
//            if(!prices.containsKey(data[0])){
//                prices.put(data[0], 0.0);
//            }
//
//            if(!quantity.containsKey(data[0])){
//                quantity.put(data[0], 0.0);
//            }
//
//            prices.put(data[0], Double.parseDouble(data[1]));
//
//            double lastQuantity = quantity.get(data[0]);
//            quantity.put(data[0], lastQuantity + Double.parseDouble(data[2]));
//
//            expression = input.nextLine();
//        }
//
//        for(Map.Entry<String, Double> products : quantity.entrySet()){
//            cost.put(products.getKey(), products.getValue());
//        }
//
//        for(Map.Entry<String, Double> price : prices.entrySet()){
//            double totalValue = cost.get(price.getKey()) * price.getValue();
//            cost.put(price.getKey(), totalValue);
//            totalValue = 0.0;
//        }
//
//        for(Map.Entry<String, Double> printsTotalValue : cost.entrySet()){
//            System.out.printf("%s -> %.2f%n", printsTotalValue.getKey(), printsTotalValue.getValue());
//        }
//    }
//}
