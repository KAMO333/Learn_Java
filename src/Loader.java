//Threads in Java are like a music band performing live:

//System: The entire band (program) working together.
//Thread: Each musician (thread) playing their part independently.
//Concurrency: All musicians play simultaneously, but in harmony (different components run at the same time).
//Synchronization: The conductor (system control) ensures they stay in sync, avoiding clashes.

//class Loader extends Thread {
//    public void run() {
//        System.out.println("am running...");
//    }
//}
//
//class Running {
//    public static void main(String[] args) {
//        Loader x = new Loader();
//        x.start();
//    }
//}

class Loader implements Runnable {
    public void run() {
        System.out.println("am running...");
    }
}

class MainMain {
    public static void main(String[] args) {
        Thread j = new Thread(new Loader());
        j.start();
    }
}

//There are two exception types, checked and unchecked (also called runtime).
// The main difference is that checked exceptions are checked when compiled,
// while unchecked exceptions are checked at runtime.

