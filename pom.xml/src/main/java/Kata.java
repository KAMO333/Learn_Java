import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public static int squareSum(int[] n) {
        int results = 0;

        for(int value: n) {
            results += value * value;
        }

        return results;
    }

    public static String alphabetWar(String fight){
        Map<Character, Integer> powerLetters = new HashMap<>(); {
            powerLetters.put('w', 4);
            powerLetters.put('p', 3);
            powerLetters.put('b', 2);
            powerLetters.put('s', 1);
            powerLetters.put('m', 4);
            powerLetters.put('q', 3);
            powerLetters.put('d', 2);
            powerLetters.put('z', 1);
        }

        int leftSide = 0;
        int rightSide = 0;

        for(int i = 0; i < fight.length(); i++) {
            if(powerLetters.containsKey(fight.charAt(i))) {
                if(fight.charAt(i) == 'w') {
                    leftSide += powerLetters.get('w');
                } else if (fight.charAt(i) == 'p') {
                    leftSide += powerLetters.get('p');
                } else if (fight.charAt(i) == 'b') {
                    leftSide += powerLetters.get('b');
                } else if (fight.charAt(i) == 's') {
                    leftSide += powerLetters.get('s');
                } else if (fight.charAt(i) == 'm') {
                    rightSide += powerLetters.get('m');
                } else if (fight.charAt(i) == 'q') {
                    rightSide += powerLetters.get('q');
                } else if (fight.charAt(i) == 'd') {
                    rightSide += powerLetters.get('d');
                } else if (fight.charAt(i) == 'z') {
                    rightSide += powerLetters.get('z');
                } else {
                    continue;
                }
            }
        }

        if (leftSide > rightSide) {
            return "Left side wins!";
        } else if (rightSide > leftSide) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }

    public static String broken(final String x) {
       Map<String, String> binaryCode = new HashMap<>();
       binaryCode.put("0", "1");
       binaryCode.put("1", "0");

       String results = "";

       for(int i = 0; i < x.length(); i += 1) {
           results += binaryCode.get(String.valueOf(x.charAt(i)));
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

    public static String[] stringToArray(String s) {
        return s.split(" ");

    }
}


