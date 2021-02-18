package Lists;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>(100);

        for(int a = 1; a <= 15; a++){
            numbers.add(a * 10);
        }

        numbers.forEach(e -> System.out.print(e + " "));
        System.out.println();

        for(int a = 0; a <= 10; a++){
            if(a % 2 != 0){
                numbers.remove(a);
            }
            //с всяка итерация размерът на списъкът става по-малък
        }

        numbers.forEach(e -> System.out.print(e + " "));
        System.out.println();

        numbers.remove(Integer.valueOf(100));
        numbers.forEach(e -> System.out.print(e + " "));
        System.out.println();

        int theNumberOfTheSixthIndex = numbers.get(6);
        theNumberOfTheSixthIndex *= 10;
        numbers.set(6, theNumberOfTheSixthIndex);
        //numbers.set(6, numbers.get(6) * 10);
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
