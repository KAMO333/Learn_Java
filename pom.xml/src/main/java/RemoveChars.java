public class RemoveChars {
    public static String remove(String str) {

        String res = "";

        for(int i = 1; i < str.length() - 1; i++) {
            res += str.charAt(i);
        }

        return res;
    }
}
