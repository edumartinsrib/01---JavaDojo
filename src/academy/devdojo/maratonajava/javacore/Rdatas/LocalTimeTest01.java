package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {

  public static void main(String[] args) {
    LocalTime time = LocalTime.of(23, 59, 59);
    System.out.println(time);
    LocalTime timeNow = LocalTime.now();
    System.out.println(timeNow);
    System.out.println(time.getHour());
    System.out.println(time.getMinute());
    System.out.println(time.getSecond());
    System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
    System.out.println(ChronoField.HOUR_OF_DAY.range());
    System.out.println(LocalTime.MAX);
    System.out.println(LocalTime.MIN);
  }
}
