package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter several real numbers separated by spaces:");
        String exp1 = input.nextLine();
        System.out.println("Minimum");
        System.out.println(Arrays.stream(exp1.split("\\s+")).mapToDouble(number -> Double.parseDouble(number)).min().getAsDouble());
        System.out.println("Maximum");
        System.out.println(Arrays.stream(exp1.split("\\s+")).mapToDouble(number -> Double.parseDouble(number)).max().getAsDouble());
        System.out.println("Sum");
        System.out.println(Arrays.stream(exp1.split("\\s+")).mapToDouble(number -> Double.parseDouble(number)).sum());
        System.out.println("Average");
        double current = Arrays.stream(exp1.split("\\s+")).mapToDouble(number -> Double.parseDouble(number)).average().getAsDouble();
        System.out.println(current);

        //Ако е възможно да няма елементи, трябва да добавя .getAsDouble()



        double[] realNumbers = {15.2, 14.8, 15.3, 16.2, 16.7, 21.5, 21.6, 21.8, 18.1, 18.0, 17.9, 17.4, 25.3, 25.5};

        //За да филтрирам елементите на един масив и да ги принтирам пиша следният израз
        Arrays.stream(realNumbers).filter(num -> num > 20).forEach(number -> System.out.print(number + " "));
        System.out.println();
        //или
        Arrays.stream(realNumbers).filter(num -> num > 25).forEach(System.out::println);



        //Създаване на масив или списък
        System.out.println("Enter several integers separated by spaces:");
        String exp2 = input.nextLine();
        int[] integerNumbers = Arrays.stream(exp2.split("\\s+")).mapToInt(i -> Integer.parseInt(i)).toArray();
        //int[] integerNumbers = Arrays.stream(exp2.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.print("Created the array:" + " ");
        for(int entry : integerNumbers){
            System.out.printf("%d ", entry);
        }
        System.out.println();

        System.out.println("Enter several numbers separated by spaces:");
        String exp3 = input.nextLine();
        List<Double> numbers = Arrays.stream(exp3.split("\\s+")).map(d -> Double.parseDouble(d)).collect(Collectors.toList());
        //List<Double> numbers = Arrays.stream(exp3.split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
        System.out.print("Created the list:" + " ");
        for(double entry : numbers){
            System.out.printf("%.2f ", entry);
        }
        System.out.println();



        //СОРТИРАНЕ
        List<Integer> otherNumbers = new ArrayList<>(Arrays.asList(6, 3, 1, 52, -14, 16, 108, -22, 53, 31, 600));

        otherNumbers
                .stream()
                .sorted((num1, num2) -> {
                    int compare = Integer.compare(num1, num2);
                    return compare;
                })
                .forEach(e -> System.out.printf("%d ", e));
        System.out.println();

        otherNumbers
                .stream()
                .sorted((num1, num2) -> Integer.compare(num1, num2))
                .forEach(e -> System.out.printf("%d ", e));
        System.out.println();
        //Когато сортирането е написано по следният начин: .sorted((num1, num2) -> Integer.compare(num1, num2)), все едно, че имам return, макар че не се изписва изрично

        List<String> countries = new ArrayList<>(Arrays.asList("Cameroon", "Georgia", "India", "Australia", "Belarus", "Ecuador", "Brazil", "Japan", "Bulgaria", "China", "France", "Hungary"));
        //Сортиране според дължината на думата
        countries
                .stream()
                .sorted((w1, w2) -> Integer.compare(w1.length(), w2.length()))
                .forEach(w -> System.out.print(w + " "));
        System.out.println();

        //Сортиране по азбучен ред
        countries
                .stream()
                .sorted((w1, w2) -> w1.compareTo(w2))
                .forEach(w -> System.out.print(w + " "));
        System.out.println();

        //Сортиране по обърнат азбучен ред
        countries
                .stream()
                .sorted((w1, w2) -> w2.compareTo(w1))
                .forEach(w -> System.out.print(w + " "));
        System.out.println();

    }
}

//3 6 9 12 15 18 21
//15.2 14.8 15.3 16.2 16.7 21.5 21.6 21.8 18.1 18.0 17.9 17.4 25.3 25.5
