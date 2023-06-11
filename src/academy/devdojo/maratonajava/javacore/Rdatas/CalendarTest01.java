package academy.devdojo.maratonajava.javacore.Rdatas;

import java.util.Calendar;

public class CalendarTest01 {

  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar);
    System.out.println(calendar.get(Calendar.YEAR));
    System.out.println(calendar.get(Calendar.MONTH));
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
  }
}
