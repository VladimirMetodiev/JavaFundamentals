package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {
    public static void main(String[] args) {
        String str = "85.46 85.59 85.92 84.98 84.21 82.76 82.77 82.84 83.33 83.69";

        List<Double> realNumbers = Arrays.stream(str.split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        List<Double> workingList = new ArrayList<>();
        List<Double> anotherWorkingList = new ArrayList<>();

        for(int a = 0; a < realNumbers.size(); a++){
            workingList.add(realNumbers.get(a));
            anotherWorkingList.add(realNumbers.get(a));
        }


        Collections.sort(workingList);
        //Collections.sort(workingList, Collections.reverseOrder());
        //workingList.sort(Collections.reverseOrder());
        System.out.print("Sorted numbers: ");
        workingList.forEach(e -> System.out.print(e + " "));
        System.out.println();


        Collections.reverse(anotherWorkingList);
        System.out.print("Reversed numbers: ");
        anotherWorkingList.forEach(e -> System.out.print(e + " "));
    }
}
