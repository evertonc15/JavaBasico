import java.util.Locale;

public class idiomadosistema {
    public static void main(String[] args) {
        Locale lingua = Locale.getDefault();
        System.out.println("O idioma é:");
        System.out.println(lingua.getDisplayLanguage());
    }
}
