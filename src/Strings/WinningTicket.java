package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> tickets = new ArrayList<>(Arrays.asList(input.nextLine().split("[,\\s]+")));
        ArrayList<String> winningSymbols = new ArrayList<>(Arrays.asList("@", "#", "$", "^"));

        String leftHalf = "", rightHalf = "", symbolOnTheLeft = "", symbolOnTheRight = "";
        int currentCount = 1, leftMaxCount = 0, rightMaxCount = 0;

        for (int a = 0; a < tickets.size(); a++){
            if(tickets.get(a).length() != 20){
                System.out.println("invalid ticket");
                continue;
            }

            leftHalf = tickets.get(a).substring(0, tickets.get(a).length() / 2);                            //0, 10
            rightHalf = tickets.get(a).substring(tickets.get(a).length() / 2, tickets.get(a).length());     //10, 20

            for (int b = 0; b < winningSymbols.size(); b++) {
                for (int c = 0; c < tickets.get(a).length() / 2; c++) {
                    if((c + 1) == tickets.get(a).length() / 2){
                        break;
                    }

                    if(("" + leftHalf.charAt(c)).equals(winningSymbols.get(b)) && ("" + leftHalf.charAt(c)).equals(("" + leftHalf.charAt(c + 1))) && (c + 1) == tickets.get(a).length() / 2 - 1){
                        currentCount++;
                        if(currentCount > leftMaxCount){
                            leftMaxCount = currentCount;
                            symbolOnTheLeft = winningSymbols.get(b);
                            currentCount = 1;
                        }
                        break;
                    }
                    else if(("" + leftHalf.charAt(c)).equals(winningSymbols.get(b)) && !("" + leftHalf.charAt(c)).equals(("" + leftHalf.charAt(c + 1))) && (c + 1) == tickets.get(a).length() / 2 - 1){
                        if(currentCount > leftMaxCount){
                            leftMaxCount = currentCount;
                            symbolOnTheLeft = winningSymbols.get(b);
                            currentCount = 1;
                        }
                        break;
                    }
                    else if(("" + leftHalf.charAt(c)).equals(winningSymbols.get(b)) && ("" + leftHalf.charAt(c)).equals(("" + leftHalf.charAt(c + 1)))){
                        currentCount++;
                    }
                    else if(("" + leftHalf.charAt(c)).equals(winningSymbols.get(b)) && !("" + leftHalf.charAt(c)).equals(("" + leftHalf.charAt(c + 1)))){
                        if(currentCount > leftMaxCount){
                            leftMaxCount = currentCount;
                            symbolOnTheLeft = winningSymbols.get(b);
                            currentCount = 1;
                        }
                    }

                    if((c + 1) == tickets.get(a).length() / 2){
                        break;
                    }
                }
                currentCount = 1;

                for (int c = 0; c < tickets.get(a).length() / 2; c++) {
                    if((c + 1) == tickets.get(a).length() / 2){
                        break;
                    }

                    if(("" + rightHalf.charAt(c)).equals(winningSymbols.get(b)) && ("" + rightHalf.charAt(c)).equals(("" + rightHalf.charAt(c + 1))) && (c + 1) == tickets.get(a).length() / 2 - 1){
                        currentCount++;
                        if(currentCount > rightMaxCount){
                            rightMaxCount = currentCount;
                            symbolOnTheRight = winningSymbols.get(b);
                            currentCount = 1;
                        }
                        break;
                    }
                    else if(("" + rightHalf.charAt(c)).equals(winningSymbols.get(b)) && !("" + rightHalf.charAt(c)).equals(("" + rightHalf.charAt(c + 1))) && (c + 1) == tickets.get(a).length() / 2 - 1){
                        if(currentCount > rightMaxCount){
                            rightMaxCount = currentCount;
                            symbolOnTheRight = winningSymbols.get(b);
                            currentCount = 1;
                        }
                        break;
                    }
                    else if(("" + rightHalf.charAt(c)).equals(winningSymbols.get(b)) && ("" + rightHalf.charAt(c)).equals(("" + rightHalf.charAt(c + 1)))){
                        currentCount++;
                    }
                    else if(("" + rightHalf.charAt(c)).equals(winningSymbols.get(b)) && !("" + rightHalf.charAt(c)).equals(("" + rightHalf.charAt(c + 1)))){
                        if(currentCount > rightMaxCount){
                            rightMaxCount = currentCount;
                            symbolOnTheRight = winningSymbols.get(b);
                            currentCount = 1;
                        }
                    }
                }
                currentCount = 1;
            }

            if(!symbolOnTheLeft.equals(symbolOnTheRight)){
                System.out.printf("ticket \"%s\" - no match%n", tickets.get(a));
                continue;
            }

            if(leftMaxCount == rightMaxCount && leftMaxCount == 10){
                System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", tickets.get(a), leftMaxCount, symbolOnTheLeft);
            }
            else if(leftMaxCount == rightMaxCount && leftMaxCount >= 6 && leftMaxCount < 10){
                System.out.printf("ticket \"%s\" - %d%s%n", tickets.get(a), leftMaxCount, symbolOnTheLeft);
            }
            else if(leftMaxCount != rightMaxCount && (leftMaxCount < rightMaxCount ? leftMaxCount : rightMaxCount) >= 6 && (leftMaxCount < rightMaxCount ? leftMaxCount : rightMaxCount) < 10){
                System.out.printf("ticket \"%s\" - %d%s%n", tickets.get(a), (leftMaxCount < rightMaxCount ? leftMaxCount : rightMaxCount), (leftMaxCount < rightMaxCount ? symbolOnTheLeft : symbolOnTheRight));
            }
            else{
                System.out.printf("ticket \"%s\" - no match%n", tickets.get(a));
            }

            leftMaxCount = 0;
            rightMaxCount = 0;
        }
    }
}



//Tests

//Cash$$$$$$Ca$$$$$$sh                                              6$
//$$$$$$$$$$$$$$$$$$$$   ,   aabb  ,     th@@@@@@eemo@@@@@@ey       10$ invalid ticket 6@
//validticketnomatch:(                                              no match
//@@@@@@@#@@@@@#@@@@@@                                              6@
//#@@@@@@@@@@@@@@@@@@#                                              9@



//Грешката в първоначалното ми решение произтичаше от това, че в номера на един билет може да има повече от един
//печеливш символ и аз трябваше да взема най-дългата последователност от печеливши символи, както за лявата, така и за
//дясната страна.



//Bad code

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        ArrayList<String> tickets = new ArrayList<>(Arrays.asList(input.nextLine().split("[,\\s]+")));
//
//        String leftHalf = "", rightHalf = "", containsSymbol = "";
//        int left = 0, right = 0;
//
//        for (int a = 0; a < tickets.size(); a++){
//            if(tickets.get(a).length() != 20){
//                System.out.println("invalid ticket");
//                continue;
//            }
//
//            leftHalf = tickets.get(a).substring(0, tickets.get(a).length() / 2);
//            rightHalf = tickets.get(a).substring(tickets.get(a).length() / 2, tickets.get(a).length());
//
//            for (int b = 0; b < leftHalf.length(); b++) {
//                containsSymbol = "" + leftHalf.charAt(b);
//
//                if(containsSymbol.equals("@") || containsSymbol.equals("#") || containsSymbol.equals("$") || containsSymbol.equals("^")){
//                    left = countsSymbols(leftHalf, containsSymbol);
//                    right = countsSymbols(rightHalf, containsSymbol);
//                    break;
//                }
//            }
//
//            if(left == right && left == 10){
//                System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", tickets.get(a), left, containsSymbol);
//            }
//            else if(left == right && left >= 6 && left < 10){
//                System.out.printf("ticket \"%s\" - %d%s%n", tickets.get(a), left, containsSymbol);
//            }
//            else if(left != right && (left < right ? left : right) >= 6 && (left < right ? left : right) < 10){
//                System.out.printf("ticket \"%s\" - %d%s%n", tickets.get(a), (left < right ? left : right), containsSymbol);
//            }
//            else{
//                System.out.printf("ticket \"%s\" - no match%n", tickets.get(a));
//            }
//
//            left = 0;
//            right = 0;
//        }
//    }
//
//
//    public static int countsSymbols(String str, String symbol){
//        int count = 0;
//
//        for(int c = 0; c < str.length() - 1; c++){
//            if(("" + str.charAt(c)).equals(symbol)){
//                count++;
//            }
//        }
//
//        return count;
//    }
