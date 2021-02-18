package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> theFirstList = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> theSecondList = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> theThirdList = new ArrayList<>();

        for(int a = 0; a < (theFirstList.size() >= theSecondList.size() ? theFirstList.size() : theSecondList.size()); a++){
            if(a < theFirstList.size()){
                theThirdList.add(theFirstList.get(a));
            }
            if(a < theSecondList.size()){
                theThirdList.add(theSecondList.get(a));
            }
        }

        for(int number : theThirdList){
            System.out.printf("%d ", number);
        }
    }
}
