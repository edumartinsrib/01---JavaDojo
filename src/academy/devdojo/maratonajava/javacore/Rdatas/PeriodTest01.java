package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {

  public static void main(String[] args) {
    Period tenDays = Period.ofDays(10);
    Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
    System.out.println(tenDays);
    System.out.println(oneYearTwoMonthsThreeDays);
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);
    System.out.println(now.plus(tenDays));

    Period period = Period.between(now.toLocalDate(), now.plusDays(10).toLocalDate());
    System.out.println(period.getDays());
  }
}
