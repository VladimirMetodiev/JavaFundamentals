package DataTypesAndVariables;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CheckTheSummation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.nextLine());
        double b = Double.parseDouble(input.nextLine());
        double c = Double.parseDouble(input.nextLine());

        boolean result = validatesResult(a, b, c);
        System.out.println(result);
    }


    public static boolean validatesResult(double a, double b, double c){
        DecimalFormat df = new DecimalFormat("0.####");
        boolean isItTrue = false;

        BigDecimal firstNumber = new BigDecimal(a);
        BigDecimal secondNumber = new BigDecimal(b);
        BigDecimal thirdNumber = new BigDecimal(c);

        BigDecimal addition = firstNumber.add(secondNumber);

        if(df.format(addition).equals(df.format(thirdNumber))){
            isItTrue = true;
        }

        return isItTrue;
    }
}



//Проверете дали реалните числа a + b = c;
//Допустима грешка - 0,0001

//    public static boolean validatesResult(double a, double b, double c){
//        return Math.abs((a + b) - c) < 0.0001;
//    }

//Tests:

//0.1
//0.2
//0.3

//1.5
//-2.5
//-1
