package ObjectsAndClasses;

import java.util.Scanner;

public class OtherPeople {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        OtherPerson person1 = new OtherPerson(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()));
        OtherPerson person2 = new OtherPerson(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()));

        person1.printsInfo();
        person2.printsInfo();
    }
}

class OtherPerson{
    public String name;
    public String surname;
    public int age;

    OtherPerson(String concreteName, String concreteSurname, int concreteAge){
        this.name = concreteName;
        this.surname = concreteSurname;
        this.age = concreteAge;
    }

    void printsInfo(){
        System.out.printf("%s %s is %d years old.%n", name, surname, age);
    }
}