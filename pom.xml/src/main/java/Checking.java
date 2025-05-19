public class Checking {
    public static int addNum(int x, int y) {
        return x + y;
    }

    public static boolean direction( String dir) {
        return dir.equals("left") || dir.equals("right");
    }

    public static int smallest(int[] arr) {
        int first = arr[0];
        int res = 0;

        for (int j : arr) {
            if (j <= first) {
                res = j;
            }
        }
        return res;
    }

    public static String message(Object[] msg) {

        for(int i = 0; i < msg.length; i++) {
            if (msg[i].equals("msg")) {
                return "string is at " + i;
            } else{
                return "string not found";
            }
        }
        return "";
    }


}

