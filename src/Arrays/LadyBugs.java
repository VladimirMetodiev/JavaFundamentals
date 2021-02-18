package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fieldSize = Integer.parseInt(input.nextLine());

        String[] indexes = input.nextLine().split(" ");
        int[] field = new int[fieldSize];

        for (int a = 0; a < indexes.length; a++) {
            int index = Integer.parseInt(indexes[a]);
            if(index >= 0 && index < fieldSize){
                field[index] = 1;
            }
        }

        String command = input.nextLine();

        while(!command.equals("end")){

            String[] cmdArgs = command.split(" ");
            int index = Integer.parseInt(cmdArgs[0]);
            String cmd = cmdArgs[1];
            int flyLength = Integer.parseInt(cmdArgs[2]);

            if(index < 0 || index > fieldSize - 1 || field[index] == 0){
                command = input.nextLine();
                continue;
            }

            field[index] = 0;

            if(cmd.equals("right")){
                index += flyLength;
                while (index < fieldSize && field[index] == 1){
                    index += flyLength;
                }
                if(index < fieldSize){
                    field[index] = 1;
                }
            }
            else{
                index -= flyLength;
                while (index >= 0 && field[index] == 1){
                    index -= flyLength;
                }
                if(index >= 0){
                    field[index] = 1;
                }
            }

            command = input.nextLine();
        }

        for(int num : field){
            System.out.printf("%d ", num);
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int fieldSize = Integer.parseInt(input.nextLine());
//
//        String[] indexes = input.nextLine().split(" ");
//        int[] field = new int[fieldSize];
//
//        for (int a = 0; a < indexes.length; a++) {
//            int index = Integer.parseInt(indexes[a]);
//            if(index >= 0 && index < fieldSize){
//                field[index] = 1;
//            }
//        }
//
//        String command = input.nextLine();
//
//        while(!command.equals("end")){
//
//            String[] cmdArgs = command.split(" ");
//            int index = Integer.parseInt(cmdArgs[0]);
//            String cmd = cmdArgs[1];
//            int flyLength = Integer.parseInt(cmdArgs[2]);
//
//            if(index < 0 || index > fieldSize - 1 || field[index] == 0){
//                command = input.nextLine();
//                continue;
//            }
//
//            field[index] = 0;
//
//            if(cmd.equals("right")){
//                index += flyLength;
//                while (index < fieldSize && field[index] == 1){
//                    index += flyLength;
//                }
//                if(index < fieldSize){
//                    field[index] = 1;
//                }
//            }
//            else{
//                index -= flyLength;
//                while (index >= 0 && field[index] == 1){
//                    index -= flyLength;
//                }
//                if(index >= 0){
//                    field[index] = 1;
//                }
//            }
//
//            command = input.nextLine();
//        }
//
//        for(int num : field){
//            System.out.printf("%d ", num);
//        }
//    }



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int[] field = new int[Integer.parseInt(input.nextLine())];
//
//        int[] indexes = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
//
//        for (int i = 0; i < indexes.length; i++) {
//            if (indexes[i] >= 0 && indexes[i] < field.length) {
//                field[indexes[i]] = 1;
//            }
//        }
//
//        String command = "";
//
//        while (!(command = input.nextLine()).equals("end")) {
//
//            String[] expression = command.split(" ");
//
//            int startIndex = Integer.parseInt(expression[0]);
//            String direction = expression[1];
//            int moving = Integer.parseInt(expression[2]);
//
//            if (startIndex < 0 || startIndex >= field.length || field[startIndex] == 0) {
//                continue;
//            }
//
//            field[startIndex] = 0;
//
//            if (direction.equals("right")) {
//                while (startIndex + moving < field.length && startIndex + moving >= 0) {
//                    if (field[startIndex + moving] == 0) {
//                        field[startIndex + moving] = 1;
//                        break;
//                    } else {
//                        moving += moving;
//                    }
//                }
//            } else if (direction.equals("left")) {
//                while (startIndex - moving >= 0 && startIndex - moving < field.length) {
//                    if (field[startIndex - moving] == 0) {
//                        field[startIndex - moving] = 1;
//                        break;
//                    } else {
//                        moving += moving;
//                    }
//                }
//            }
//        }
//        for (int num : field) {
//            System.out.print(num + " ");
//        }
//    }



//    public static void main(String[] args){
//        //Judge: 40/100
//        Scanner input = new Scanner(System.in);
//
//        int field = Integer.parseInt(input.nextLine());
//        int[] initialIndexes = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
//
//        String expression = "";
//        String[] command;
//        int[] indexes = new int[field];
//        int startIndex, moving;
//        String direction = "";
//
//        for(int a = 0; a < initialIndexes.length; a++){
//            int current = initialIndexes[a];
//            if(current >= 0 && current < field){
//                indexes[current] = 1;
//            }
//        }
//
//        while (!(expression = input.nextLine().toLowerCase()).equals("end")) {
//
//            command = expression.split(" ");
//
//            startIndex = Integer.parseInt(command[0]);
//            direction = command[1];
//            moving = Integer.parseInt(command[2]);
//
//            if (indexes[startIndex] == 0 || startIndex < 0 || startIndex >= field) {
//                expression = input.nextLine().toLowerCase();
//                continue;
//            }
//
//            indexes[startIndex] = 0;
//
//            if (direction.equals("left")) {
//                while (true) {
//                    if((startIndex - moving) < 0 || (startIndex - moving) >= field){
//                        break;
//                    }
//
//                    if (indexes[startIndex - moving] == 0) {
//                        indexes[startIndex - moving] = 1;
//                        break;
//                    }
//                    else {
//                        moving += moving;
//                    }
//                    //Ако целевата позиция е заета от друго насекомо, калинката се премества със същата дължина на полет
//                }
//            }
//            else if (direction.equals("right")) {
//                while (true) {
//                    if((startIndex + moving) < 0 || (startIndex + moving) >= field){
//                        break;
//                    }
//
//                    if (indexes[startIndex + moving] == 0) {
//                        indexes[startIndex + moving] = 1;
//                        break;
//                    }
//                    else {
//                        moving += moving;
//                    }
//                }
//            }
//        }
//
//        for(int num : indexes){
//            System.out.printf("%d ", num);
//        }
//    }