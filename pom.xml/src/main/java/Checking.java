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
}

