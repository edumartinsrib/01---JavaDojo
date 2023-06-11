package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
  public static void main(String[] args) {
    float result = divisao(5, 2);
    System.out.println(result);
    System.out.println("Código finalizado");
  }

  /**
   * @param a
   * @param b não pode ser zero
   * @return
   * @throws IllegalArgumentException caso b seja zero
   */
  private static float divisao(float a, float b) throws IllegalArgumentException {
    if (b == 0) {
      throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
    }
    try {
      return a / b;
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
      throw e;
    }

  }
}
