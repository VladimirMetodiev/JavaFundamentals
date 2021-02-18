package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        char[] reverseUserName = new char[50];
        String passWord = "";
        String  writeThePassword = "";
        int counter = 0;

        for (int i = 0; i < userName.length(); i++) {
            reverseUserName[i] = userName.charAt(i);
        }

        for (int j = userName.length() - 1; j >= 0; j--) {
            passWord = passWord + reverseUserName[j];
        }

        while(true){
            writeThePassword = input.nextLine();
            counter++;
            if(passWord.equals(writeThePassword)){
                System.out.printf("User %s logged in.", userName);
                return;
            }
            else{
                if(counter == 4){
                    System.out.printf("User %s blocked!", userName);
                    return;
                }
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}




//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String userName = input.nextLine();
//
//        int counter = 0;
//
//        String[] users = {"Acer", "momo", "sunny"};
//        String[] passwords = {"recA", "omom", "12345"};
//
//        while(true){
//            String password = input.nextLine();
//            counter++;
//            for (int i = 0; i < 3; i++) {
//                if(userName.equals(users[i])){
//                    if(password.equals(passwords[i])){
//                        System.out.printf("User %s logged in.", userName);
//                        return;
//                    }
//                    else{
//                        if(counter == 4){
//                            System.out.printf("User %s blocked!", userName);
//                            return;
//                        }
//                        System.out.println("Incorrect password. Try again.");
//                    }
//                }
//            }
//        }
//    }