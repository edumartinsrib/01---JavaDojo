package academy.devdojo.maratonajava.javacore.Rdatas;

import java.util.Date;

public class DateTest01 {
  public static void main(String[] args) {
    Date date = new Date(1, 1, 2021);
    date.setDate(31);
    date.setMonth(12);
    date.setYear(2020);
    date.setHours(23);
    date.setMinutes(59);
    date.setSeconds(59);
    System.out.println(date);

  }
}
