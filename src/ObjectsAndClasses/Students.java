package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String expression;
        String[] contents = new String[4];
        Student people = new Student();
        int counter = 0;

        while(!(expression = input.nextLine()).equals("end")){
            contents = expression.split("\\s+");
            people.firstName.add(contents[0]);
            people.lastName.add(contents[1]);
            people.age.add(Integer.parseInt(contents[2]));
            people.hometown.add(contents[3]);
            counter++;
        }

        expression = input.nextLine();

        for (int a = 0; a < counter; a++) {
            if(people.hometown.get(a).equals(expression)){
                System.out.printf("%s %s is %d years old%n", people.firstName.get(a), people.lastName.get(a), people.age.get(a));
            }
        }
    }
}

class Student{
    List<String> firstName = new ArrayList<>();
    List<String> lastName = new ArrayList<>();
    List<Integer> age = new ArrayList<>();
    List<String> hometown = new ArrayList<>();
}
