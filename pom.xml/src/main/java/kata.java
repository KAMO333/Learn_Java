import java.util.Arrays;

public class kata {
    public static int min(int[] list) {
        int mini = list[0];

        for(int i : list) {
            if(i < mini) {
                mini = i;
            }
        }
        return mini;
    }

    public static int max(int[] list) {
        int maxi = list[0];

        for(int i : list) {
            if(i > maxi) {
                maxi = i;
            }
        }
        return maxi;
    }
}
