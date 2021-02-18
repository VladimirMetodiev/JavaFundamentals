package Maps;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TreeMap<String, ArrayList<String>> players = new TreeMap<>();
        String expression, side, user;
        String[] data;
        boolean doesItContainTheName = false;

        while(!(expression = input.nextLine()).equals("Lumpawaroo")){
            if(expression.contains("|")){
                data = expression.split("\\s+\\|\\s+");
                side = data[0];
                user = data[1];

                for(Map.Entry<String, ArrayList<String>> verification : players.entrySet()){
                    if(verification.getValue().contains(user)){
                        doesItContainTheName = true;
                        break;
                    }
                }

                if(!doesItContainTheName){
                    if(!players.containsKey(side)){
                        players.put(side, new ArrayList<>());
                        players.get(side).add(user);
                    }
                    else if(players.containsKey(side) && !players.get(side).contains(user)){
                        players.get(side).add(user);
                    }
                }

                if(doesItContainTheName){
                    doesItContainTheName = false;
                }
            }
            else if(expression.contains("->")) {
                data = expression.split("\\s+->\\s+");
                side = data[1];
                user = data[0];

                for (Map.Entry<String, ArrayList<String>> verification : players.entrySet()) {
                    if (verification.getValue().contains(user)) {
                        players.get(verification.getKey()).remove(user);
                        break;
                    }
                }

                if (!players.containsKey(side)) {
                    players.put(side, new ArrayList<>());
                    players.get(side).add(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }
                else if (players.containsKey(side) && !players.get(side).contains(user)) {
                    players.get(side).add(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }
            }
        }

        players
                .entrySet()
                .stream()
                .filter(users -> users.getValue().size() > 0)
                .sorted(Map.Entry.<String, ArrayList<String>>comparingByValue(Comparator.comparing(ArrayList::size)).reversed())
                .forEach(s -> {
                    System.out.printf("Side: %s, Members: %d%n", s.getKey(), s.getValue().size());

                    s.getValue()
                            .stream()
                            .sorted(String::compareTo)
                            .forEach(person -> System.out.printf("! %s%n", person));
                });
    }
}




//Работещ код

//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        TreeMap<String, ArrayList<String>> players = new TreeMap<>();
//        String expression, side, user;
//        String[] data;
//
//        while(!(expression = input.nextLine()).equals("Lumpawaroo")){
//            if(expression.contains("|")){
//                data = expression.split("\\s+\\|\\s+");
//                boolean doesItContainTheName = false;
//                side = data[0];
//                user = data[1];
//
//                //Когато получа forceSide | forceUser първо трябва да проверя дали forceUser-a съществува
//                //За да проверя дали дадена стойност я има в Map-a, трябва да премина през Map-а с цикъл
//                for(Map.Entry<String, ArrayList<String>> verification : players.entrySet()){
//                    if(verification.getValue().contains(user)){
//                        doesItContainTheName = true;
//                        break;
//                    }
//                }
//
//                if(!doesItContainTheName){
//                    if(!players.containsKey(side)){
//                        players.put(side, new ArrayList<>());
//                    }
//
//                    players.get(side).add(user);
//                }
//            }
//            else if(expression.contains("->")) {
//                data = expression.split("\\s+->\\s+");
//                side = data[1];
//                user = data[0];
//
//                for(Map.Entry<String, ArrayList<String>> verification : players.entrySet()){
//                    if(verification.getValue().contains(user)){
//                        players.get(verification.getKey()).remove(user);
//                        break;
//                    }
//                }
//
//                if (!players.containsKey(side)) {
//                    players.put(side, new ArrayList<>());
//                }
//
//                players.get(side).add(user);
//                System.out.printf("%s joins the %s side!%n", user, side);
//            }
//        }
//
//        players
//                .entrySet()
//                .stream()
//                .filter(p -> p.getValue().size() > 0)
//                .sorted(Map.Entry.<String, ArrayList<String>>comparingByValue(Comparator.comparing(ArrayList::size)).reversed())
//                .forEach(p -> {
//                    System.out.printf("Side: %s, Members: %d%n", p.getKey(), p.getValue().size());
//
//                    p.getValue()
//                            .stream()
//                            .sorted(String::compareTo)
//                            .forEach(u -> System.out.printf("! %s%n", u));
//                });
//    }




//Работещ код

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        TreeMap<String, ArrayList<String>> players = new TreeMap<>();
//        String expression, side, user;
//        String[] data;
//        boolean doesItContainTheName = false;
//
//        while(!(expression = input.nextLine()).equals("Lumpawaroo")){
//            if(expression.contains("|")){
//                data = expression.split("\\s+\\|\\s+");
//                side = data[0];
//                user = data[1];
//
//                for(Map.Entry<String, ArrayList<String>> verification : players.entrySet()){
//                    if(verification.getValue().contains(user)){
//                        doesItContainTheName = true;
//                        break;
//                    }
//                }
//
//                if(!doesItContainTheName){
//                    if(!players.containsKey(side)){
//                        players.put(side, new ArrayList<>());
//                        players.get(side).add(user);
//                    }
//                    else if(players.containsKey(side) && !players.get(side).contains(user)){
//                        players.get(side).add(user);
//                    }
//                }
//
//                if(doesItContainTheName){
//                    doesItContainTheName = false;
//                }
//            }
//            else if(expression.contains("->")){
//                data = expression.split("\\s+->\\s+");
//                side = data[1];
//                user = data[0];
//
//                if(!players.containsKey(side)){
//                    players.put(side, new ArrayList<>());
//
//                    for(Map.Entry<String, ArrayList<String>> verification : players.entrySet()){
//                        if(verification.getValue().contains(user)){
//                            players.get(verification.getKey()).remove(user);
//                            players.get(side).add(user);
//                            doesItContainTheName = true;
//                            System.out.printf("%s joins the %s side!%n", user, side);
//                            break;
//                        }
//                    }
//
//                    if(doesItContainTheName == false){
//                        players.get(side).add(user);
//                        System.out.printf("%s joins the %s side!%n", user, side);
//                    }
//
//                    if(doesItContainTheName == true){
//                        doesItContainTheName = false;
//                    }
//                }
//                else{
//                    for(Map.Entry<String, ArrayList<String>> verification : players.entrySet()){
//                        if(verification.getValue().contains(user)){
//                            players.get(verification.getKey()).remove(user);
//                            players.get(side).add(user);
//                            doesItContainTheName = true;
//                            System.out.printf("%s joins the %s side!%n", user, side);
//                            break;
//                        }
//                    }
//
//                    if(doesItContainTheName == false){
//                        players.get(side).add(user);
//                        System.out.printf("%s joins the %s side!%n", user, side);
//                    }
//
//                    if(doesItContainTheName == true){
//                        doesItContainTheName = false;
//                    }
//                }
//            }
//        }
//
//        players
//                .entrySet()
//                .stream()
//                .filter(users -> users.getValue().size() > 0)
//                .sorted(Map.Entry.<String, ArrayList<String>>comparingByValue(Comparator.comparing(ArrayList::size)).reversed())
//                .forEach(s -> {
//                    System.out.printf("Side: %s, Members: %d%n", s.getKey(), s.getValue().size());
//
//                    s.getValue()
//                            .stream()
//                            .sorted(String::compareTo)
//                            .forEach(person -> System.out.printf("! %s%n", person));
//                });
//    }




//Test

//Fire | Ivan
//Water | Stoian
//Air | Petar
//Fire | Radoslav
//Air | Martin
//Fire | Vladimir
//Ivan -> Air
//Lumpawaroo
