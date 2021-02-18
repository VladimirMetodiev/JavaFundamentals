package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;

public class People {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        List<String> names = new ArrayList<>();
        List<String> surnames = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();

        names.add(person1.name = "Anna");
        surnames.add(person1.surname = "Dimitrova");
        ages.add(person1.age = 25);

        names.add(person2.name = "Vladimir");
        surnames.add(person2.surname = "Metodiev");
        ages.add(person2.age = 41);

        names.add(person3.name = "Nikola");
        surnames.add(person3.surname = "Zidarov");
        ages.add(person3.age = 32);

        names.add(person4.name = "Iana");
        surnames.add(person4.surname = "Borisova");
        ages.add(person4.age = 28);

        for (int i = 0; i < 4; i++) {
            System.out.printf("%s %s is %d years old.%n", names.get(i), surnames.get(i), ages.get(i));
        }
    }
}

class Person{
    String name;
    String surname;
    int age;
}