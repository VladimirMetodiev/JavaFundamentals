package Maps;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String expression;
        String[] data;

        TreeMap<String, ArrayList<String>> companiesAndEmployees = new TreeMap<>();

        while(!(expression = input.nextLine()).equals("End")){
            data = expression.split(" -> ");

            if(!companiesAndEmployees.containsKey(data[0])){
                companiesAndEmployees.put(data[0], new ArrayList<>());
            }

            if(!companiesAndEmployees.get(data[0]).contains(data[1])){
                companiesAndEmployees.get(data[0]).add(data[1]);
            }


        }

        companiesAndEmployees
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, ArrayList<String>>comparingByKey())
                .forEach(company -> {
                    System.out.println(company.getKey());
                    for(String id : company.getValue()){
                        System.out.printf("-- %s%n", id);
                    }
                });
    }
}
