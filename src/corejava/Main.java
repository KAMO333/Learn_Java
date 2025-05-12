package corejava;//public class corejava.Main {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//    }
//}

public class Main {
    public static void main(String[] args) {
        Loading loading = new Loading();
        loading.LoadingMessage();
    }
}

class Loading {
    void LoadingMessage() {
        System.out.println("corejava.Loading...");
    }

}
