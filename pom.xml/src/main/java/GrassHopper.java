public class GrassHopper {
    public static int summation(int n) {
        int counter = 0;

        for(int i = 1; i <= n; i += 1) {
            counter += i;
        }
        return counter;
    }
}
