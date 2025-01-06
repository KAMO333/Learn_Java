//Inner class:
//A class can have inner classess which are set to private,
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
