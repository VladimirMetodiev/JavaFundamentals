package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;

public class AnotherPeople {
    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        List<String> surnames = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();

        AnotherPerson person1 = new AnotherPerson();
        AnotherPerson person2 = new AnotherPerson();
        AnotherPerson person3 = new AnotherPerson();

        person1.name = "Peter";
        person1.surname = "Anderson";
        person1.age = 30;
        person1.sex = "male";
        person1.personalNumber = "890912750";

        person2.name = "James";
        person2.surname = "Beater";
        person2.age = 28;
        person2.sex = "male";
        person2.personalNumber = "9112043453";

        person3.name = "Alexander";
        person3.surname = "Kites";
        person3.age = 31;
        person3.sex = "male";
        person3.personalNumber = "8826061111";

        names.add(0, person1.name);
        names.add(1, person2.name);
        names.add(2, person3.name);

        surnames.add(0, person1.surname);
        surnames.add(1, person2.surname);
        surnames.add(2, person3.surname);

        ages.add(0, person1.age);
        ages.add(1, person2.age);
        ages.add(2, person3.age);

        System.out.printf("%s %s is %d years old%n", names.get(0), surnames.get(0), ages.get(0));
        System.out.printf("%s %s is %d years old%n", names.get(1), surnames.get(1), ages.get(0));
        System.out.printf("%s %s is %d years old%n", names.get(2), surnames.get(2), ages.get(0));
    }
}

class AnotherPerson {
    public String name;
    public String surname;
    public int age;
    public String sex;
    public String personalNumber;
}