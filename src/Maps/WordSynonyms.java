package Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        LinkedHashMap<String, ArrayList<String>> vocabulary = new LinkedHashMap<>();

        for (int a = 0; a < number; a++){
            String vocable = input.nextLine();
            String synonym = input.nextLine();

            vocabulary.putIfAbsent(vocable, new ArrayList<String>()); //този метод върши същото, както долният израз

//            if(!vocabulary.containsKey(vocable)){
//                vocabulary.put(vocable, new ArrayList<String>());
//            }

            vocabulary.get(vocable).add(synonym);
        }

        for(Map.Entry<String, ArrayList<String>> word : vocabulary.entrySet()){
            System.out.printf("%s - ", word.getKey());

            ArrayList<String>  synonyms = word.getValue();
            for(int a = 0; a < synonyms.size(); a++){
                if(a == synonyms.size() - 1){
                    System.out.println(synonyms.get(a));
                }
                else{
                    System.out.printf("%s, ", synonyms.get(a));
                }
            }
        }
    }
}

//vocabulary.put(vocable, new ArrayList<String>());
//vocabulary.get(vocable).add(synonym);
