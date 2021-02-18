package ObjectsAndClasses;

import java.util.*;

public class StudentsVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String expression;
        StudentVarTwo newStudent = new StudentVarTwo();

        while(!(expression = input.nextLine()).equals("end")){
            String[] tokens = expression.split("\\s+");

            if(newStudent.doesTheStudentExist(tokens[0], tokens[1])){
                newStudent.overwritesTheInformation(tokens[0], tokens[1], tokens[2], tokens[3]);
            }
            else{
                newStudent.firstName.add(tokens[0]);
                newStudent.lastName.add(tokens[1]);
                newStudent.age.add(tokens[2]);
                newStudent.hometown.add(tokens[3]);
            }
        }

        expression = input.nextLine();

        newStudent.printsTheResults(expression);
    }
}

class StudentVarTwo{
    List<String> firstName = new ArrayList<>();
    List<String> lastName = new ArrayList<>();
    List<String> age = new ArrayList<>();
    List<String> hometown = new ArrayList<>();

    public StudentVarTwo(){

    }

    public boolean doesTheStudentExist(String name, String surname){
        boolean result = false;
        for (int index = 0; index < firstName.size(); index++) {
            if (firstName.get(index).equals(name) && lastName.get(index).equals(surname)){
                result = true;
                break;
            }
        }
        return result;
    }

    public void overwritesTheInformation(String name, String surname, String ageOfTheStudent, String town){
        for (int index = 0; index < firstName.size(); index++) {
            if (firstName.get(index).equals(name) && lastName.get(index).equals(surname)){
                this.lastName.set(index, surname);
                this.age.set(index, ageOfTheStudent);
                this.hometown.set(index, town);
            }
        }
    }

    public void printsTheResults(String town){
        for (int index = 0; index < firstName.size(); index++) {
            if (hometown.get(index).equals(town)){
                System.out.printf("%s %s is %s years old%n", this.firstName.get(index), this.lastName.get(index), this.age.get(index));
            }
        }
    }
}
