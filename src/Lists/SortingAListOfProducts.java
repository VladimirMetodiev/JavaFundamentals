package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingAListOfProducts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        List<String> products = new ArrayList<>();
        String addNewProduct = "";

        for(int a = 0; a < number; a++){
            products.add(addNewProduct = input.nextLine());
        }

        Collections.sort(products);

        for (int b = 0; b < products.size(); b++) {
            System.out.printf("%d.%s%n", b + 1, products.get(b));
        }
    }
}
