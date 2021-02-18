package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OtherPhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> otherPhoneBook = new HashMap<>();
        otherPhoneBook.put("John Smith", new ArrayList<>());
        otherPhoneBook.put("Lisa Smith", new ArrayList<>());
        otherPhoneBook.put("Sam Doe", new ArrayList<>());

        ArrayList<String> phonesOfJohnSmith = otherPhoneBook.get("John Smith");
        phonesOfJohnSmith.add("+1-555-8976");
        phonesOfJohnSmith.add("+1-558-1127");

        ArrayList<String> phonesOfLisaSmith = otherPhoneBook.get("Lisa Smith");
        phonesOfLisaSmith.add("+1-558-1128");
        phonesOfLisaSmith.add("+1-563-8261");
        phonesOfLisaSmith.add("+1-576-9342");

        ArrayList<String> phonesOfSamDoe = otherPhoneBook.get("Sam Doe");
        phonesOfSamDoe.add("+1-998-4015");
        phonesOfSamDoe.add("+1-877-5348");
        phonesOfSamDoe.add("+1-558-1130");

//        for(Map.Entry<String, ArrayList<String>> nameAndPhones : otherPhoneBook.entrySet()){
//            System.out.println(nameAndPhones.getKey());
//            System.out.println(nameAndPhones.getValue());
//        }

        for(Map.Entry<String, ArrayList<String>> nameAndPhones : otherPhoneBook.entrySet()){
            System.out.println(nameAndPhones.getKey());

            List<String> phones = nameAndPhones.getValue();
            for(String phone : phones){
                System.out.println(phone);
            }
        }
    }
}
