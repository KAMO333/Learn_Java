public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;

        for(int i = 0; i < arrayOfSheeps.length; i += 1) {
            if(arrayOfSheeps[i] == null) {
                continue;
            } else if (arrayOfSheeps[i] == true) {
                count++;
            }
        }
        return count;
    }
}
