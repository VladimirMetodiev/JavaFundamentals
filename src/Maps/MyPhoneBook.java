package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyPhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Vladimir Metodiev", "+35988-877-2000");
        phoneBook.put("Anna Dimitrova", "+35988-855-4080");
        phoneBook.put("Iana Dimitrova", "+35988-855-4082");
        phoneBook.put("Dragomir Ivanov", "+35987-712-3811");
        phoneBook.put("Bojidar Petrov", "+35988-842-7163");
        phoneBook.put("Dimitar Harizanov", "+35988-724-4297");
        phoneBook.put("Boris Hristov", "+35987-511-7723");

        //Взимам обекта съответсващ на даден ключ
        System.out.println(phoneBook.get("Anna Dimitrova"));

        //Заменям стойността съответстваща на даден ключ
        phoneBook.replace("Bojidar Petrov", "+35988-842-7164");

        //Премахвам елемента съответстващ на даден ключ
        phoneBook.remove("Boris Hristov");



        //Обхождам обект от тип Map.Entry<K, V> (двойката key - value се нарича entry), за да взема всички entry - та използвам .entrySet()
        //Бележка: при данните от тип set не може да има една и съща стойност два пъти

        //Принтирам всички ключове, които съм взел с .getKey() и всички стойности, които съм взел с .getValue()
        for(Map.Entry<String, String> item : phoneBook.entrySet()){
            System.out.printf("[Key: %s - Value: %s]%n", item.getKey(), item.getValue());
        }
        System.out.println();

        //Взимам цялото множество от ключове на асоциативният масив phoneBook
        Set<String> keys = phoneBook.keySet();

        for(String item : keys){
            System.out.print(item + " / ");
        }
        System.out.println();

        //Взимам цялото множество от значения на асоциативният масив phoneBook
        Collection<String> values = phoneBook.values();

        for(String item : values){
            System.out.print(item + " / ");
        }
        System.out.println();
    }
}
