package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

  public static void main(String[] args) {
    Instant now = Instant.now();
    System.out.println(LocalDateTime.now());
    System.out.println(now);
    System.out.println(now.getEpochSecond());
    System.out.println(now.getNano());
    System.out.println(Instant.ofEpochSecond(0, 1000000000));
    System.out.println(Instant.ofEpochSecond(1_000_000_000));
    System.out.println(Instant.ofEpochSecond(1_000_000_000, 100));
    System.out.println(Instant.parse("2023-06-11T20:39:00.000000Z"));
    Duration fiveSeconds = Duration.ofSeconds(30);
    System.out.println(fiveSeconds);
    System.out.println(Instant.now().plus(fiveSeconds));
    System.out.println(Instant.now().plusSeconds(5));
  }
}
