package corejava;//Inner class:
//corejava.A class can have inner classess which are set to private,
// they can be accessable within the class but never outside it.

class Robot {
    int id;
    Robot(int i) {
        id = i;
        Brain b = new Brain();
        b.think();
    }

    private class Brain{
        public void think() {
            System.out.println(id + " is thinking");
        }
    }
}

class RunRobot{
    public static void main(String[] args) {
        Robot r = new Robot(2);
    }
}

//COMPARE OBJECTS:

//object variables store references, so when comparing two objects, we actually compare
//their memory location not the object value.

//EQUALS():

//in order to check for this correctly we must use the equals() methods which requires the
//hashCode() method.

//ENUMS:

//so basically they store variables of the same type in one place so we can use it easyly.
class Prog {
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }

    public static void main(String[] args) {
        Rank a = Rank.CAPTAIN;

        switch (a) {
            case SOLDIER:
                System.out.println("am a soldier");
                break;
            case SERGEANT:
                System.out.println("am a sergent");
                break;
            case CAPTAIN:
                System.out.println("am the captain");
        }

    }

}


