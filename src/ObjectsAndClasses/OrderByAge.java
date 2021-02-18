package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Prs> anotherPeople = new ArrayList<>();
        String expression;
        String[] data;

        while(!(expression = input.nextLine()).equals("End")){
            data = expression.split("\\s+");
            Prs ppl = new Prs(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            anotherPeople.add(ppl);
        }

        anotherPeople.sort((firstPerson, secondPerson) -> firstPerson.getAge()- secondPerson.getAge());

        anotherPeople.forEach(prs -> System.out.println(prs.toString()));
    }
}

class Prs{
    String name;
    int id;
    int age;

    public Prs(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %d is %d years old.", this.getName(), this.getId(), this.getAge());
    }
}
