package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double budget = Double.parseDouble(input.nextLine());
        int students = Integer.parseInt(input.nextLine());
        double priceOfLightsaber = Double.parseDouble(input.nextLine());
        double priceOfRobe = Double.parseDouble(input.nextLine());
        double priceOfBelt = Double.parseDouble(input.nextLine());

        double discount = students / 6 * priceOfBelt;
        double totalSum = (students + Math.ceil(students * 10 / 100.0)) * priceOfLightsaber + students * priceOfRobe + students * priceOfBelt - discount;

        if(budget >= totalSum){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }
        else{
            System.out.printf("Ivan Cho will need %.2flv more.", totalSum - budget);
        }
    }
}
