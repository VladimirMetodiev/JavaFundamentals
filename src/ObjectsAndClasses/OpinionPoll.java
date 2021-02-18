package ObjectsAndClasses;

import java.util.*;
import java.util.stream.Collectors;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        List<HumanBeing> statisticalGroup = new ArrayList<>();
        String[] expression;
        HumanBeing being = new HumanBeing();

        for (int a = 0; a < number; a++) {
            expression = input.nextLine().split(" ");
            being = new HumanBeing(expression[0], Integer.parseInt(expression[1]));
            statisticalGroup.add(being);
        }

        statisticalGroup = statisticalGroup.stream().filter(person -> person.getAge() > 30).collect(Collectors.toCollection(ArrayList::new));

        statisticalGroup.stream().sorted((firstPerson, secondPerson) -> firstPerson.getName().compareTo(secondPerson.getName())).forEach(person -> System.out.println(person.toString()));

    }
}

class HumanBeing{
    private String name;
    private int age;

    HumanBeing(){

    }

    HumanBeing(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.getAge();
    }
}
