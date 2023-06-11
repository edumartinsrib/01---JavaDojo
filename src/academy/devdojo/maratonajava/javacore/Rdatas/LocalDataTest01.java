package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDate;
import java.time.Month;

public class LocalDataTest01 {

  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2021, 2, 28);
    LocalDate date2 = LocalDate.of(2021, Month.FEBRUARY, 28);
    System.out.println(date);
    System.out.println(date2);
    System.out.println(LocalDate.MAX);
    System.out.println(LocalDate.MIN);
    LocalDate agora = LocalDate.now().plusDays(2);
    LocalDate amanha = agora.plusDays(1);
    System.out.println(amanha);
    System.out.println(agora);
  }
}
