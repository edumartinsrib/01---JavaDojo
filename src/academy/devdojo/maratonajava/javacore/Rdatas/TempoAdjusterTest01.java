package academy.devdojo.maratonajava.javacore.Rdatas;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.ChronoField.*;

class ObterProximoDiaUtil implements TemporalAdjuster {
  @Override
  public Temporal adjustInto(Temporal temporal) {
    DayOfWeek diaSemana = DayOfWeek.of(temporal.get(DAY_OF_WEEK));
    int addDays = 1;

    switch (diaSemana) {
      case FRIDAY:
        addDays = 3;
        break;
      case SATURDAY:
        addDays = 2;
        break;
      default:
        addDays = 1;
    }

    return temporal.plus(addDays, ChronoUnit.DAYS);
  }
}

public class TempoAdjusterTest01 {

  public static void main(String[] args) {
    LocalDate dataDomingo = LocalDate.of(2021, 1, 10);
    LocalDate agora = LocalDate.now().plusDays(3);
    System.out.println(dataDomingo.getDayOfWeek());
    System.out.println(dataDomingo.with(new ObterProximoDiaUtil()));
    System.out.println(LocalDate.now().with(new ObterProximoDiaUtil()));
    System.out.println(agora.with(new ObterProximoDiaUtil()));
  }

}
