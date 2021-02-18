package Maps;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] data = input.nextLine().toLowerCase().split("\\s+");

        LinkedHashMap<String, ArrayList<Integer>> words = new LinkedHashMap<>();

        for(int a = 0; a < data.length; a++){
            int counter = 0;
            for(String element : data){
                if(element.equals(data[a])){
                    counter++;
                }
            }

            if(!words.containsKey(data[a]) && counter % 2 != 0){
                words.put(data[a], new ArrayList<>());
                words.get(data[a]).add(counter);
            }
        }

        ArrayList<String> output = new ArrayList<>();

        for(Map.Entry<String, ArrayList<Integer>> vocable : words.entrySet()){
            output.add(vocable.getKey());
        }

        for(int b = 0; b < output.size(); b++){
            if(b == output.size() - 1){
                System.out.println(output.get(b));
            }
            else{
                System.out.printf("%s, ", output.get(b));
            }
        }
    }
}
