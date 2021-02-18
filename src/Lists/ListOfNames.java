package Lists;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfNames {
    public static void main(String[] args){

        List<String> maleNames = new ArrayList<>();

        maleNames.add("Adam");
        maleNames.add("Andrew");
        maleNames.add("Benjamin");
        maleNames.add("Charles");
        maleNames.add(1, "Alexander");
        maleNames.add("David");
        maleNames.add("George");
        maleNames.add("James");
        maleNames.add("Philip");
        maleNames.add("Richard");

        maleNames.remove("Philip");

        List<String> newNames = new ArrayList<>();

        newNames.add("Robert");
        newNames.add("Thomas");

        maleNames.addAll(newNames);

        for(String name : maleNames){
            System.out.print(name + " ");
        }
        System.out.println();

        List<String> femaleNames = new ArrayList<>();

        femaleNames.add("Anne");
        femaleNames.add("Ashley");
        femaleNames.add("Emily");
        femaleNames.add("Georgia");
        femaleNames.add("Lauren");
        femaleNames.add("Sophie");

        femaleNames.add(2, "Christine");

        femaleNames.forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println(maleNames.indexOf("James"));
        System.out.println();
    }
}
