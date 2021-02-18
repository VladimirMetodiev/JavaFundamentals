package Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TreeMap<String, Integer> keyMaterials = new TreeMap<>();
        TreeMap<String, Integer> junkMaterials = new TreeMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        int lastNumber = 0;
        String winner = " ";

        while (winner.equals(" ")){
            String[] data = input.nextLine().toLowerCase().split("\\s+");

            for(int a = 0; a < data.length; a++){
                if(a % 2 != 0){
                    if(data[a].equals("shards") || data[a].equals("fragments") || data[a].equals("motes")){
                        lastNumber = keyMaterials.get(data[a]);
                        keyMaterials.put(data[a], lastNumber + Integer.parseInt(data[a - 1]));

                        if(winner.equals(" ")){
                            winner = determinesWinner(keyMaterials, winner, data[a]);
                            if(!winner.equals(" ")){
                                recalculatesWinnerMaterial(keyMaterials, data[a]);
                                break;
                            }
                        }
                    }
                    else{
                        junkMaterials.putIfAbsent(data[a], 0);
                        lastNumber = junkMaterials.get(data[a]);
                        junkMaterials.put(data[a], lastNumber + Integer.parseInt(data[a - 1]));
                    }
                }
            }

        }

        System.out.println(winner + " obtained!");

        keyMaterials
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));

//        keyMaterials
//                .entrySet()
//                .stream()
//                .sorted((a, b) ->{
//                    if(b.getValue() - a.getValue() == 0){
//                        return a.getKey().compareTo(b.getKey());
//                    }
//                    else {
//                        return b.getValue() - a.getValue();
//                    }
//                })
//                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));

        junkMaterials
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));

//        for(Map.Entry<String, Integer> result : junkMaterials.entrySet()){
//            System.out.printf("%s: %d%n", result.getKey(), result.getValue());
//        }
    }

    public static String determinesWinner(TreeMap<String, Integer> keyMats, String winner, String key){
        if(keyMats.get(key) >= 250){
            switch (key){
                case "shards": winner = "Shadowmourne"; break;
                case "fragments": winner = "Valanyr"; break;
                case "motes": winner = "Dragonwrath"; break;
                default: break;
            }
        }
        return winner;
    }

    public static void recalculatesWinnerMaterial(TreeMap<String, Integer> keyMaterials, String key){
        int newValue = keyMaterials.get(key) - 250;
        keyMaterials.put(key, newValue);
    }
}





//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        TreeMap<String, Integer> keyMaterials = new TreeMap<>();
//        TreeMap<String, Integer> junkMaterials = new TreeMap<>();
//
//        keyMaterials.put("shards", 0);
//        keyMaterials.put("fragments", 0);
//        keyMaterials.put("motes", 0);
//
//        int lastNumber = 0;
//        String winner = " ";
//
//        while (winner.equals(" ")){
//            String[] data = input.nextLine().toLowerCase().split("\\s+");
//
//            for(int a = 0; a < data.length; a++){
//                if(a % 2 != 0){
//                    if(data[a].equals("shards") || data[a].equals("fragments") || data[a].equals("motes")){
//                        lastNumber = keyMaterials.get(data[a]);
//                        keyMaterials.put(data[a], lastNumber + Integer.parseInt(data[a - 1]));
//
//                        if(winner.equals(" ")){
//                            winner = determinesWinner(keyMaterials, winner, data[a]);
//                            if(!winner.equals(" ")){
//                                recalculatesWinnerMaterial(keyMaterials, data[a]);
//                                break;
//                            }
//
//                        }
//                    }
//                    else{
//                        junkMaterials.putIfAbsent(data[a], 0);
//                        lastNumber = junkMaterials.get(data[a]);
//                        junkMaterials.put(data[a], lastNumber + Integer.parseInt(data[a - 1]));
//                    }
//                }
//            }
//
//        }
//
//        System.out.println(winner + " obtained!");
//
//        for(Map.Entry<String, Integer> result : keyMaterials.entrySet()){
//            System.out.printf("%s: %d%n", result.getKey(), result.getValue());
//        }
//
//        for(Map.Entry<String, Integer> result : junkMaterials.entrySet()){
//            System.out.printf("%s: %d%n", result.getKey(), result.getValue());
//        }
//    }
//
//    public static String determinesWinner(TreeMap<String, Integer> keyMats, String winner, String key){
//        if(keyMats.get(key) >= 250){
//            switch (key){
//                case "shards": winner = "Shadowmourne"; break;
//                case "fragments": winner = "Valanyr"; break;
//                case "motes": winner = "Dragonwrath"; break;
//                default:break;
//            }
//        }
//        return winner;
//    }
//
//    public static void recalculatesWinnerMaterial(TreeMap<String, Integer> keyMaterials, String key){
//        int newValue = keyMaterials.get(key) - 250;
//        keyMaterials.put(key, newValue);
//    }



//Input:

//123 silver 6 shards 8 shards 5 motes
//9 fangs 75 motes 103 MOTES 8 Shards
//86 Motes 7 stones 19 silver

//Output:

//Dragonwrath obtained!
//shards: 22
//motes: 19
//fragments: 0
//fangs: 9
//silver: 123
