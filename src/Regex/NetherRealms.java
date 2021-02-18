package Regex;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NetherRealms {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] demons = input.nextLine().split(",\\s*");

        TreeMap<String, Integer> demonHealth = new TreeMap<>();
        TreeMap<String, Double> demonDamage = new TreeMap<>();

        int health;
        double damage;

        for(String demon : demons){
            //demon = demon.replaceAll(",", "");
            demon = demon.replaceAll("\\s", "");

            health = determinesHealth(demon);
            damage = determinesDamage(demon);

            demonHealth.put(demon, health);
            demonDamage.put(demon, damage);
        }

        demonHealth
                .entrySet()
                .stream()
                .forEach(demon -> System.out.printf("%s - %d health, %.2f damage%n", demon.getKey(), demon.getValue(), demonDamage.get(demon.getKey())));
    }


    public static int determinesHealth(String demonName){
        int result = 0;
        String current = "";

        Pattern pattern = Pattern.compile("[^0-9*\\/+\\-.]+");
        Matcher health = pattern.matcher(demonName);

        while(health.find()){
            current = current + health.group();
        }

        for (int a = 0; a < current.length(); a++) {
            result += (int)current.charAt(a);
        }

        return result;
    }


    public static double determinesDamage(String demonName){
        double result = 0.0;

        Pattern pattern = Pattern.compile("([+-]?\\d+\\.?\\d*)");
        Matcher matcher = pattern.matcher(demonName);

        while(matcher.find()){
            result += Double.parseDouble(matcher.group());
        }

        for (int b = 0; b < demonName.length(); b++) {
            if((demonName.charAt(b)) == '*'){
                result *= 2;
            }
            else if((demonName.charAt(b)) == '/'){
                result /= 2;
            }
        }

        return result;
    }
}



//Test

//M3ph1st0**, Azazel

//Result:

//Azazel - 615 health, 0.00 damage
//M3ph1st0** - 524 health, 16.00 damage



//Test

//M3ph-0.5s-0.5t0.0**

//Result:

//M3ph-0.5s-0.5t0.0** - 524 health, 8,00 damage



//Test

//Gos/ho

//Result:

//Gos/ho - 512 health, 0,00 damage



//Test

//Ar2ga24mod**, bom56/Di-2.1gi-3.2ri-4.3gi56bom26*, Ca2,gur6.2 k, dik8lak-2*16*+5, Mur60/,Hur12.5*,48*Bur-15



//Проблеми, който коригирах:
//В имената не може да има интервал или запетая
//Имената на демоните са резделени от запетая и нула или повече интервала
