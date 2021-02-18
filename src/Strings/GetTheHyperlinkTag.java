package Strings;

public class GetTheHyperlinkTag {
    public static void main(String[] args) {
        String html = "For <asd>more</asd> <u>information</u> click <a href=\"aboutus.html\">here</a>";

        int startIndex = html.indexOf("<a ");
        html = html.substring(startIndex);
        int endIndex = html.indexOf(">");
        String hyperlinkTag = html.substring(0, endIndex + 1);
        System.out.println(hyperlinkTag);
    }
}
