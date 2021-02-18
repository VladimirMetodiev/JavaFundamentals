package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<String> schedule = Arrays.stream(input.nextLine().split(", ")).collect(Collectors.toList());

        String expression;
        String[] command = new String[3];

        while(!(expression = input.nextLine()).equals("course start")){
            command = expression.split(":");

            switch (command[0]){
                case "Add": addsALesson(schedule, command[1]); break;
                case "Insert": insertsALesson(schedule, command[1], Integer.parseInt(command[2])); break;
                case "Remove": removesALesson(schedule, command[1]); break;
                case "Swap": swapsALesson(schedule, command[1], command[2]); break;
                case "Exercise": addsAExercise(schedule, command[1]); break;
                default: break;
            }
        }

        for(int a = 0; a < schedule.size(); a++){
            System.out.printf("%d.%s%n", a + 1, schedule.get(a));
        }
    }

    static List<String> addsALesson(List<String> lessons, String title){
        if(!lessons.contains(title)){
            lessons.add(title);
        }
        return lessons;
    }

    static List<String> insertsALesson(List<String> lessons, String title, int index){
        if(!lessons.contains(title)){
            lessons.add(index, title);
        }
        return lessons;
    }

    static List<String> removesALesson(List<String> lessons, String title){
        if(lessons.contains(title)){
            lessons.remove(title);

            if(lessons.contains(title + "-Exercise")){
                lessons.remove(title + "-Exercise");
            }
        }
        return lessons;
    }

    static List<String> swapsALesson(List<String> lessons, String theFirstTitle, String theSecondTitle){
        if(lessons.contains(theFirstTitle) && lessons.contains(theSecondTitle)){
            int firstIndex = lessons.indexOf(theFirstTitle);
            int secondIndex = lessons.indexOf(theSecondTitle);

            String current = lessons.get(firstIndex);
            lessons.set(firstIndex, lessons.get(secondIndex));
            lessons.set(secondIndex, current);

            if(lessons.contains(theFirstTitle + "-Exercise")){
                lessons.add(secondIndex + 1, theFirstTitle + "-Exercise");
                lessons.remove(firstIndex + 1);
            }
            else if(lessons.contains(theSecondTitle + "-Exercise")){
                lessons.add(firstIndex + 1, theSecondTitle + "-Exercise");
                lessons.remove(secondIndex + 2);
            }
        }
        return lessons;
    }

    static List<String> addsAExercise(List<String> lessons, String title){
        String ex = title + "-Exercise";
        if(lessons.contains(title) && !lessons.contains(ex)){
            int indexOfALesson = lessons.indexOf(title);
            lessons.add(indexOfALesson + 1, ex);
        }
        else if(!lessons.contains(title)){
            lessons.add(title);
            lessons.add(ex);
        }
        return lessons;
    }
}
