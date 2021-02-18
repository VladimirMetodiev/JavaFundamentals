package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        List<String> phrases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."));
        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        Random random1 = new Random();
        Random random2 = new Random();
        Random random3 = new Random();
        Random random4 = new Random();

        int randomIndex1, randomIndex2, randomIndex3, randomIndex4;

        for (int index = 0; index < number; index++) {
            randomIndex1 = random1.nextInt(phrases.size());
            randomIndex2 = random2.nextInt(events.size());
            randomIndex3 = random3.nextInt(authors.size());
            randomIndex4 = random4.nextInt(cities.size());

            System.out.printf("%s %s %s - %s%n", phrases.get(randomIndex1), events.get(randomIndex2), authors.get(randomIndex3), cities.get(randomIndex4));
        }
    }
}
