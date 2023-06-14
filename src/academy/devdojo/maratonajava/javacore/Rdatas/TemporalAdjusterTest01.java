package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest01 {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
    LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
    LocalDate firstDayNextMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
    System.out.println(now);
    System.out.println(lastDay);
    System.out.println(firstDayNextMonth);

  }

}
