package Arrays;

public class SplitOn {
    public static void main(String[] args) {

        String countries = "Andorra-Angola-Argentina-Armenia-Australia-Austria-Azerbaijan";
        String[] countriesArray = countries.split("-");
        for(String name : countriesArray){
            System.out.println(name);
        }
        System.out.println();



//За да разделя един низ с множество разделители, трябва да изброя разделителите между []

        String irregularVerbs = "be,beat!bear,become.beget;begin;behold!bend.beseech!beset,bet bid bid!bind.bite,bleed;bless blow!break breed.bring broadcast;build,burn burst;buy";
        String[] irregularVerbsArray = irregularVerbs.split("[ ,;.!]");
        for(String name : irregularVerbsArray){
            System.out.println(name);
        }
        System.out.println();


//Ако два разделителя се срещат един до друг, тогава в масива ще бъдат записани празни позиции, респективно ще бъдат
//принтирани празни позиции. За да бъде избегнато това след [] трябва да напишем +

        String listOfBeers = "Ariana, Astika, Zagorka, Kamenitza, Staropramen, Stolichno.";
        String[] beersArray = listOfBeers.split("[ ,.]+");
        for(String name : beersArray){
            System.out.println(name);
        }
        System.out.println();



        String cities = "Canberra!Sydney!!Melbourne!Brisbane!!Perth";
        String[] citiesArray = cities.split("[!]+");
        for(String name : citiesArray){
            System.out.println(name);
        }
        System.out.println();


//Ако след разделителя в кавичките напиша запетая и цифра (например 3), низът ще бъде разделен на три части

        String string = "359-88-888-8888";
        String[] phoneNumber = string.split("-", 2);
        for(String name : phoneNumber){
            System.out.println(name);
        }
        System.out.println();



//Ако искам да разделя низ и разделителният знак да се изписва след всяка част, тогава трябва да използвам префикс ?<= в скоби,
//например ако разделителя е % между кавичките трябва да напиша(?<=%)

        String percents = "5.49%4.66%7.23%9.65%4.11%";
        String[] percentsArray = percents.split("(?<=%)");
        for(String name : percentsArray){
            System.out.println(name);
        }
        System.out.println();



//Ако искам да разделя низ и разделителният знак да се изписва пред всяка част, тогава трябва да използвам префикс ?= в скоби

        String dogs = "-german shepherd-labrador retriever-rottweiler-english mastiff-great dane-english bulldog-pit bull-bull terrier-saint bernard-dobermann-dalmatian";
        String[] dogsArray = dogs.split("(?=-)");
        for(String name : dogsArray){
            System.out.println(name);
        }
        System.out.println();


// Един или повече интервали (+ указва, че ако има един до друг, повече интервали, те не трябва да бъдат вземани като отделни разделители)
// \s+
// Нула или повече интервали (\s*), последвани от двуеточие (:), последвани от нула или повече интервали (\s*)
// \s*:\s*

        String names = "Adam Anderson : Anne : Charles :   Emily : George : James : Lauren : Robert : Thomas : Sarah";
        String[] line = names.split("\\s:\\s+");
        for(String name : line){
            System.out.println(name);
        }
        System.out.println();

//+ означава един или безброй пъти
//* означава нула или безброй пъти



//За да укажа, че в низът има два или повече вида разделители, първо ги поставям в скоби след това ги разделям с хоризонтална права |.
//Ex. ( \\| | -> | :--)

        String players = "Player1 | Player2 -> Player3 | Player4 -> Player5 -> Player6";
        String[] allPlayers = players.split("( \\| | -> )");
        for(String name : allPlayers){
            System.out.println(name);
        }
        System.out.println();
    }

}
