package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {

  public static void main(String[] args) {
    Map<String, String> zoneTest = ZoneId.SHORT_IDS;
    System.out.println(zoneTest);
    System.out.println(ZoneId.systemDefault());
    ZoneId myZone = ZoneId.of("Asia/Tokyo");
    System.out.println(myZone);
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);
    System.out.println(now.atZone(myZone));
    Instant nowInstant = Instant.now();
    ZonedDateTime zonedDateTime = nowInstant.atZone(myZone);
    System.out.println(zonedDateTime);

    ZoneOffset zoneOffset = ZoneOffset.of("+09:00");
    OffsetDateTime offsetDateTime = OffsetDateTime.of(now, zoneOffset);
    System.out.println(offsetDateTime);
  }
}
