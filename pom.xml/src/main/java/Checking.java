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


}

