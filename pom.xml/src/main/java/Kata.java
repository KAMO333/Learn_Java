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

    public static int[] countPositivesSumNegatives(int[] input) {

        if(input == null || input.length == 0) {
            return input;
        }

        int posCount = 0;
        int negSum = 0;

        for(int i = 0; i < input.length; i++) {
            if(input[i] > 0) {
                posCount += 1;
            } else {
                negSum += input[i];
            }
        }

        int[] results = {posCount, negSum};

        return results;
    }

    public static String evenOrOdd(int number) {
        if(number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static double findAverage(int[] array) {
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    public static int[] countBy(int x, int n){

        int[] result = new int[n];

        for(int j = 0; j < n; j++) {
            result[j] = (j + 1) * x;
        }

        return result;
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

    public static String[] stringToArray(String s) {
        return s.split(" ");

    }
}


