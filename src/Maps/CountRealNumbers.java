package Maps;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] realNumbers = Arrays.stream(input.nextLine().split("\\s+")).mapToDouble(rn -> Double.parseDouble(rn)).toArray();

        DecimalFormat df = new DecimalFormat("0.##########");

        TreeMap<Double, Integer> counts = new TreeMap<Double, Integer>();

        int counter = 0;

        for(int a = 0; a < realNumbers.length; a++){
            if(!counts.containsKey(realNumbers[a])){
                counts.put(realNumbers[a], 0);
            }

            int current = counts.get(realNumbers[a]);
            counts.put(realNumbers[a], current + 1);
        }

        for(Map.Entry<Double, Integer> element : counts.entrySet()){
            System.out.println(df.format(element.getKey()) + " -> " + element.getValue());
        }
    }
}

//Input
//8 2 2 8 2



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double[] realNumbers = Arrays.stream(input.nextLine().split("\\s+")).mapToDouble(rn -> Double.parseDouble(rn)).toArray();
//
//        DecimalFormat df = new DecimalFormat("0.##########");
//
//        TreeMap<Double, Integer> counts = new TreeMap<Double, Integer>();
//
//        int counter = 0;
//
//        for(int a = 0; a < realNumbers.length; a++){
//            if(!counts.containsKey(realNumbers[a])){
//                for (int b = 0; b < realNumbers.length; b++) {
//                    if(realNumbers[a] == realNumbers[b]){
//                        counter++;
//                    }
//                }
//                counts.put(realNumbers[a], counter);
//                counter = 0;
//            }
//        }
//
//        for(Map.Entry<Double, Integer> element :counts.entrySet()){
//            System.out.println(df.format(element.getKey()) + " -> " + element.getValue());
//        }
//    }