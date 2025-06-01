package advancedtopics;

public class MyOtherProgram {
    public static void main(String[] args) {
        Robot r = new Robot(10);

        Zoo monkey = new Zoo("mike123");
        Zoo donkey = new Zoo("mike123");

        System.out.println(monkey.equals(donkey));

        try{
            int[] a = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("an error occurred");
        }
    }
}
