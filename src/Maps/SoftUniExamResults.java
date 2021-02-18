package Maps;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> studentResults = new HashMap<>();
        TreeMap<String, Integer> appearedOnExam = new TreeMap<>();
        String expression, student, subject;
        String[] data;

        while(!(expression = input.nextLine()).equals("exam finished")){
            data = expression.split("-");

            student = data[0];
            subject = data[1];

            if(data[1].equals("banned")){
                studentResults.remove(student);
                continue;
            }

            if(!appearedOnExam.containsKey(subject)){
                appearedOnExam.put(subject, 0);
            }

            int newValue = appearedOnExam.get(subject) + 1;
            appearedOnExam.put(subject, newValue);

            if(!studentResults.containsKey(student)){
                studentResults.put(student, 0);
            }

            if(studentResults.get(student) < Integer.parseInt(data[2])){
                studentResults.put(student, Integer.parseInt(data[2]));
            }
        }

        System.out.println("Results:");
        studentResults
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(st -> System.out.println(st.getKey() + " | " + st.getValue()));


        System.out.println("Submissions:");
        appearedOnExam
                .entrySet()
                .stream()
                .sorted((f, s) -> {
                    if(f.getValue() >= s.getValue()){
                        return f.getValue();
                    }
                    else{
                        return s.getValue();
                    }
                })
                .forEach(s -> System.out.println(s.getKey() + " - " + s.getValue()));
    }
}
