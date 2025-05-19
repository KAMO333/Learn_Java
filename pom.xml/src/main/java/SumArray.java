public class SumArray {

    public static double sum(double[] numbers) {
        double results = 0.0;


        for(int i = 0; i < numbers.length; i++) {
            results += numbers[i];
        }

        return results;

    }
}