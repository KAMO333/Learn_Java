package advancedtopics;

public class ThreadProgram {
    public static void main(String[] args) {
        Loader obj = new Loader();
        obj.start();

        Thread t = new Thread(new AnotherLoader());
        t.start();
    }
}
