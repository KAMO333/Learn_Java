public class Kata {
    public static String numberToString(int num) {
        return String.valueOf(num);
    };

    public static String noSpace(final String x) {

        StringBuilder results = new StringBuilder();

        for(int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == ' ') {
            } else {
                results.append(x.charAt(i));
            }
        }
        return results.toString();
    }

    public static String findNeedle(Object[] haystack) {

        for (int i = 0; i < haystack.length; i++) {
            if ("needle".equals(haystack[i])) {
                return "found the needle at position " + i;
            }
        }
        return "";
    }
}
