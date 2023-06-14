package academy.devdojo.maratonajava.javacore.TResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
  public static void main(String[] args) {
    ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
    System.out.println(bundle.getString("header"));
  }
}
