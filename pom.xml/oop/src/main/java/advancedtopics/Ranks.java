package advancedtopics;

public class Ranks {
    enum Rank {
        SOLDIER,
        SERGENT,
        CAPTAIN,
    }

    public static void main(String[] args) {
        Rank a = Rank.SOLDIER;

        switch (a) {
            case CAPTAIN -> System.out.println("welcome captain!");
            case SERGENT -> System.out.println("welcome sergent!");
//            case SOLDIER -> System.out.println("welcome soldier!");
            default -> System.out.println("not a military person!");
        }
    }

}
