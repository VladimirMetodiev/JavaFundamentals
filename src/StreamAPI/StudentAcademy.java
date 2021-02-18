package StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int counter = 0;
        double grade = 0.0, averageGrade;
        String name = "";

        LinkedHashMap<String, Double> students = new LinkedHashMap<>();

        while(counter++ < number){
            name = input.nextLine();
            grade = Double.parseDouble(input.nextLine());

            if(!students.containsKey(name)){
                students.put(name, grade);
            }
            else{
                averageGrade = (students.get(name) + grade) / 2.0;
                students.put(name, averageGrade);
            }
        }

        students
                .entrySet()
                .stream()
                .filter(st -> st.getValue() >= 4.5)
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(st -> System.out.printf("%s -> %.2f%n", st.getKey(), st.getValue()));
    }
}
