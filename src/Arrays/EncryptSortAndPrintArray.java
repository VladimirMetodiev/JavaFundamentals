package Arrays;

import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        String[] name = new String[number];
        int[] encryptName = new int[number];
        String currentName;
        int saveEncryptName = 0, encryption, current;

        for(int a = 0; a < number; a++){
            name[a] = input.nextLine();
        }

        for(int b = 0; b < number; b++){
            currentName = name[b];
            for(int c = 0; c < currentName.length(); c++){
                encryption = (int)currentName.charAt(c);
                if(currentName.charAt(c) == 'A' ||
                        currentName.charAt(c) == 'E' ||
                        currentName.charAt(c) == 'I' ||
                        currentName.charAt(c) == 'O' ||
                        currentName.charAt(c) == 'U' ||
                        currentName.charAt(c) == 'a' ||
                        currentName.charAt(c) == 'e' ||
                        currentName.charAt(c) == 'i' ||
                        currentName.charAt(c) == 'o' ||
                        currentName.charAt(c) == 'u'){
                    encryption *= currentName.length();
                }
                else{
                    encryption /= currentName.length();
                }
                saveEncryptName += encryption;
            }
            encryptName[b] = saveEncryptName;
            saveEncryptName = 0;
        }

        for(int d = 0; d < number - 1; d++){
            for(int e = d + 1; e < number; e++){
                current = encryptName[e];
                if(encryptName[d] > encryptName[e]){
                    encryptName[e] = encryptName[d];
                    encryptName[d] = current;
                }
            }
        }

        for(int print : encryptName){
            System.out.println(print);
        }
    }
}


//Напишете програма, която чете последователност от стрингове, от конзолата. Криптирайте всеки стринг като:
//ASCII кода на всяка гласна умножите по дължината на стринга.
//ASCII кода на всяка съгласна разделите на дължината на стринга.
//Сумирате стойностите на буквите.
//След което сортирате получените номера в последователност от по-малките към по-големите.
//Принтирате полученият резултат.
