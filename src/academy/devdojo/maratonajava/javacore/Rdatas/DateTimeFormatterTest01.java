package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println(date);
    System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

  }
}
