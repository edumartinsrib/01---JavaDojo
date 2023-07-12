package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {

  public static void main(String[] args) {

    String regex = "\\d";
    String text = "Index: 0123456789";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    System.out.println("Text:  " + text);
    System.out.println("Index: 0123456789");
    System.out.println("Regex: " + regex);
    System.out.println("Posições encontradas");
    System.out.println("quantidade");
    Collection collection = new java.util.ArrayList();
    while (matcher.find()) {
      collection.add(matcher.group());
    }

    System.out.println(collection);


  }
}
