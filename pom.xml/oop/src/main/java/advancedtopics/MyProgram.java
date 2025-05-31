package advancedtopics;

public class MyProgram {
    public static void main(String[] args) {
        double num = 4.765;
        int number = (int) num;
        String n = String.valueOf(number);

        System.out.println(number);

       Machine mean = new Machine() {
           @Override
           public void start() {
               System.out.println("we goooooing!");
           }
       };
       Machine mean2 = new Machine();
        mean2.start();
    }
}
