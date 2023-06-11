package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.of(2023, 6, 6, 20, 39, 0);
    System.out.println(localDateTime);
    System.out.println(localDateTime.getDayOfMonth());
    System.out.println(localDateTime.getDayOfWeek());
    System.out.println(localDateTime.getDayOfYear());
    System.out.println(localDateTime.getHour());
    System.out.println(localDateTime.getMinute());
    System.out.println(localDateTime.getSecond());
    System.out.println(localDateTime.getNano());
    System.out.println(localDateTime);
    System.out.println(localDateTime.plusDays(2));
  }
}
