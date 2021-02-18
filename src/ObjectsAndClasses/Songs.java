package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(input.nextLine());
        String expression = input.nextLine();

        Song anotherSong = new Song();

        for (int index = 1; index <= numberOfSongs; index++) {
            anotherSong.musicList.add(expression);

            expression = input.nextLine();
        }

        if(expression.equals("all")){
            anotherSong.printsAll();
        }
        else{
            anotherSong.printsAList(expression);
        }
    }
}

class Song{
    public List<String> musicList = new ArrayList<>();

    String[] contents = new String[3];

    void printsAll(){

        for (int a = 0; a < musicList.size(); a++) {
            contents = musicList.get(a).split("_");
            System.out.println(contents[1]);
        }
    }

    void printsAList(String list){
        for (int b = 0; b < musicList.size(); b++) {
            contents = musicList.get(b).split("_");
            if(list.equals(contents[0])){
                System.out.println(contents[1]);
            }
        }
    }

}
