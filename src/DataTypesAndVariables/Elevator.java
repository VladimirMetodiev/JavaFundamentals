package DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(input.nextLine());
        int capacity = Integer.parseInt(input.nextLine());

        int courses;

        if(numberOfPeople % capacity == 0){
            courses = numberOfPeople / capacity;
        }
        else{
            courses = numberOfPeople / capacity + 1;
        }

        System.out.println(courses);
    }
}
