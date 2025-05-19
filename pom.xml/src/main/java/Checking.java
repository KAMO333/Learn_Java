public class Checking {
    public static int addNum(int x, int y) {
        return x + y;
    }

    public static boolean direction( String dir) {
        if (dir.equals("left") || dir.equals("right")) {
            return true;
        } else {
            return false;
        }
    }

    public static int smallest(int[] arr) {
        int first = arr[0];

        int res = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= first) {
                res = arr[i];
            }
        }

        return res;

    }
}

