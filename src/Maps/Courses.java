package Maps;

import java.util.*;

public class Courses {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> allCourses = new LinkedHashMap<>();

        String expression;
        String[] data;

        while(!(expression = input.nextLine()).equals("end")){
            data = expression.split(" : ");
            String course = data[0];
            String student = data[1];

            if(!allCourses.containsKey(course)){
                allCourses.put(course, new ArrayList<>());
                allCourses.get(course).add(student);
            }
            else {
                allCourses.get(course).add(student);
            }
        }

        allCourses
                .entrySet()
                .stream()
                .sorted((first, second) -> Integer.compare(second.getValue().size(), first.getValue().size()))
                .forEach(course -> {
                    System.out.printf("%s: %d%n", course.getKey(), course.getValue().size());
                    course.getValue()
                            .stream()
                            .sorted(String::compareTo)
                            .forEach(student -> System.out.println("-- " + student));
                });
    }
}



//ВАЖНО!: Основният ми проблем при решаването на тази задача се оказа, че съм използвал TreeMap, а е трябвало да използвам LinkedHashMap



//Bad code

//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        TreeMap<String, ArrayList<String>> coursesAndStudents = new TreeMap<>();
//        TreeMap<String, Integer> numberOfStudents = new TreeMap<>();
//        String expression;
//        String[] data;
//        int counter = 0;
//
//        while(!(expression = input.nextLine()).equals("end")){
//            data = expression.split(" : ");
//            if(!coursesAndStudents.containsKey(data[0])){
//                coursesAndStudents.put(data[0], new ArrayList<>());
//                coursesAndStudents.get(data[0]).add(data[1]);
//                counter++;
//            }
//            else{
//                if(!coursesAndStudents.containsValue(data[1])){
//                    counter++;
//                }
//                coursesAndStudents.get(data[0]).add(data[1]);
//            }
//
//            if(!numberOfStudents.containsKey(data[0])){
//                numberOfStudents.put(data[0], counter);
//                counter = 0;
//            }
//            else{
//                int newNumber = numberOfStudents.get(data[0]) + counter;
//                numberOfStudents.put(data[0], newNumber);
//                counter = 0;
//            }
//        }
//
//        numberOfStudents
//                .entrySet()
//                .stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .forEach(e1 -> {
//                    System.out.printf("%s: %d%n", e1.getKey(), e1.getValue());
//
//                    coursesAndStudents
//                            .entrySet()
//                            .stream()
//                            .filter(c -> e1.getKey().equals(c.getKey()))
//                            .forEach(e2 -> {
//                                Collections.sort(e2.getValue());
//                                for(String student : e2.getValue()){
//                                    System.out.println("-- " + student);
//                                }
//                            });
//                });
//    }



//Bad code

//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        TreeMap<String, ArrayList<String>> allCourses = new TreeMap<>();
//
//        String expression;
//        String[] data;
//
//        while(!(expression = input.nextLine()).equals("end")){
//            data = expression.split(" : ");
//            String course = data[0];
//            String student = data[1];
//
//            if(!allCourses.containsKey(course)){
//                allCourses.put(course, new ArrayList<>());
//                allCourses.get(course).add(student);
//            }
//            else {
//                allCourses.get(course).add(student);
//            }
//        }
//
//        allCourses
//                .entrySet()
//                .stream()
//                .sorted(Map.Entry.<String, ArrayList<String>>comparingByValue(Comparator.comparing(ArrayList::size)).reversed())
//                .forEach(course -> {
//                    System.out.printf("%s: %d%n", course.getKey(), course.getValue().size());
//                    Collections.sort(course.getValue());
//                    for(String student : course.getValue()){
//                        System.out.println("-- " + student);
//                    }
//                });
//    }



