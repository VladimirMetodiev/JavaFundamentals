package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class DNASequences {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int verificationNumber = Integer.parseInt(input.nextLine());

        int counter = 0;
        int sum = 0;

        for (char a = 'A'; a <= 'T'; a++) {
            for (char b = 'A'; b <= 'T'; b++) {
                for (char c = 'A'; c <= 'T'; c++) {
                    if((a == 'A' || a == 'C' || a == 'G' || a == 'T') && (b == 'A' || b == 'C' || b == 'G' || b == 'T') && (c == 'A' || c == 'C' || c == 'G' || c == 'T')){
                        counter++;
                        switch (a){
                            case 'A': sum += 1; break;
                            case 'C': sum += 2; break;
                            case 'G': sum += 3; break;
                            case 'T': sum += 4; break;
                        }
                        switch (b){
                            case 'A': sum += 1; break;
                            case 'C': sum += 2; break;
                            case 'G': sum += 3; break;
                            case 'T': sum += 4; break;
                        }
                        switch (c){
                            case 'A': sum += 1; break;
                            case 'C': sum += 2; break;
                            case 'G': sum += 3; break;
                            case 'T': sum += 4; break;
                        }
                        if(sum >= verificationNumber){
                            System.out.print("O");
                            System.out.printf("%C%C%C", a, b, c);
                            System.out.print("O ");
                        }
                        else{
                            System.out.print("X");
                            System.out.printf("%C%C%C", a, b, c);
                            System.out.print("X ");
                        }
                        sum = 0;
                        if(counter == 4){
                            System.out.println();
                            counter = 0;
                        }
                    }
                    else{
                        continue;
                    }
                }
            }
        }
    }
}
