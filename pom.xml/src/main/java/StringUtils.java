public class StringUtils {

    public static String toAlternativeString(String string) {
        String res = "";

        for(int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                res += Character.toLowerCase(string.charAt(i));
            } else {
                res += Character.toUpperCase(string.charAt(i));
            }
        }
        return res;
    }
}