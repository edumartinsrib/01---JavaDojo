package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
  public static void main(String[] args) {
    System.out.println(ChronoUnit.DAYS.getDuration().getSeconds() / 86400);
    System.out.println(ChronoUnit.MONTHS.getDuration().getSeconds() / 86400);
    System.out.println(ChronoUnit.WEEKS.getDuration().getSeconds() / 86400);
    System.out.println(ChronoUnit.YEARS.getDuration().getSeconds() / 86400);
    System.out.println(ChronoUnit.DAYS.between(ChronoUnit.DAYS.addTo(LocalDate.now(), 5), LocalDate.now()));
  }

}
