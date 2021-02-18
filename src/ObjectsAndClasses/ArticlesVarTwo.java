package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        String[] expression;
        HorribleArticle article;
        List<HorribleArticle> allArticles = new ArrayList<>();

        for (int a = 0; a < number; a++) {
            expression = input.nextLine().split(", ");
            article = new HorribleArticle(expression[0], expression[1], expression[2]);
            allArticles.add(article);
        }

        String command = input.nextLine().toLowerCase();

        if(command.equals("title")){
            allArticles.stream().sorted((theFirst, theSecond) -> theFirst.getTitle().compareTo(theSecond.getTitle())).forEach(art -> System.out.println(art.toString()));

        }
        else if(command.equals("content")){
            allArticles.stream().sorted((theFirst, theSecond) -> theFirst.getContent().compareTo(theSecond.getContent())).forEach(art -> System.out.println(art.toString()));

        }
        else if(command.equals("author")){
            allArticles.stream().sorted((theFirst, theSecond) -> theFirst.getAuthor().compareTo(theSecond.getAuthor())).forEach(art -> System.out.println(art.toString()));

        }


    }
}

class HorribleArticle{
    private String title;
    private String content;
    private String author;

    public HorribleArticle(String anotherTitle, String anotherContent, String anotherAuthor){
        this.title = anotherTitle.trim();
        this.content = anotherContent.trim();
        this.author = anotherAuthor.trim();
    }

    public String getTitle() {
        return title;
    }

    public String getContent(){
        return content;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public String toString() {
        return this.getTitle() + " - " + this.content + ": " + this.author;
    }
}
