import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language){
        Map<String, String> welcomes = new HashMap<String, String>() {{
            put("english", "Welcome");
            put("czech", "Vitejte");
            put("danish", "Velkomst");
            put("dutch", "Welkom");
            put("estonian", "Tere tulemast");
            put("finnish", "Tervetuloa");
            put("flemish", "Welgekomen");
            put("french", "Bienvenue");
            put("german", "Willkommen");
            put("irish", "Failte");
            put("italian", "Benvenuto");
            put("latvian", "Gaidits");
            put("lithuanian", "Laukiamas");
            put("polish", "Witamy");
            put("spanish", "Bienvenido");
            put("swedish", "Valkommen");
            put("welsh", "Croeso");
        }};



    }
}
