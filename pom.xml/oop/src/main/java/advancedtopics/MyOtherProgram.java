package advancedtopics;

public class MyOtherProgram {
    public static void main(String[] args) {
        Robot r = new Robot(10);

        Zoo monkey = new Zoo("mike123");
        Zoo donkey = new Zoo("mike123");

        System.out.println(monkey.equals(donkey));
    }
}
