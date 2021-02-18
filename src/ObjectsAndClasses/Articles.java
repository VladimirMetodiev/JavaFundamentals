package ObjectsAndClasses;

import java.util.Scanner;

public class Articles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        int number = Integer.parseInt(input.nextLine());

        String[] data = expression.split(", ");

        Article article = new Article(data[0], data[1], data[2]);

        for (int a = 0; a < number; a++) {
            String[] line = input.nextLine().split(": ");
            switch (line[0]){
                case "Edit": article.editsTheContent(line[1]); break;
                case "ChangeAuthor": article.changesTheAuthor(line[1]); break;
                case "Rename": article.renamesTheTitle(line[1]); break;
                default: break;
            }
        }

        //System.out.printf("%s - %s: %s", article.title, article.content, article.author);
        System.out.println(article.toString());
    }
}

class Article{
    public String title;
    public String content;
    public String author;

    public Article(String anotherTitle, String anotherContent, String anotherAuthor){
        this.title = anotherTitle.trim();
        this.content = anotherContent.trim();
        this.author = anotherAuthor.trim();
    }

    public void editsTheContent(String str){
        this.content = str;
    }

    public void changesTheAuthor(String str){
        this.author = str;
    }

    public void renamesTheTitle(String str){
        this.title = str;
    }

    @Override
    public String toString(){

        return this.title + " - " + this.content + ": " + this.author;
    }
}
