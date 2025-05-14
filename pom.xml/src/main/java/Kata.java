import java.util.ArrayList;

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

    public static String solution(String str) {

        StringBuilder results = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i-- ) {
            results.append(str.charAt(i));
        }
        return results.toString();
    }

    public static int[] invert(int[] array) {

        int[] results = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            results[i] = -array[i];
        }
        return results;
    }
}

class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String res = "";

        for(int i = 0; i < repeat; i++) {
            res += string;
        }
        return res;
    }
}
