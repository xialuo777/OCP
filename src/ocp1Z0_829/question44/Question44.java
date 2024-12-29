package ocp1Z0_829.question44;

import java.util.Locale;
import java.util.ResourceBundle;

public class Question44 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Locale currentLocale = new Locale.Builder().setLanguageTag("en").build();
        ResourceBundle bundle = ResourceBundle.getBundle("Captions.properties", currentLocale);
        System.out.println(bundle.getString("user"));
    }
}
