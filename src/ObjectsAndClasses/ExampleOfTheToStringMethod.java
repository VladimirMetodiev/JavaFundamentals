package ObjectsAndClasses;

import java.util.Scanner;

public class ExampleOfTheToStringMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        Developer dev = new Developer(name);
        System.out.println(dev.toString());
    }
}

class Developer{
    String name;

    Developer(String name){
        this.name = name;
    }

    public String toString(){
        return "This is " + name;
    }
}
