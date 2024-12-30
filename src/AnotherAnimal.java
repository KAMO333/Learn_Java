abstract class Animals {
    int legs = 0;
    abstract void makeSounds();
}

//this class hides how the methods works, it just tells us what it does. this is abstraction.
//in order for use to use it, we must inherit it in our subclasses.

class smallCat extends Animals {
    public void makeSounds() {
        System.out.println("Meow");
    }
}

class bigProgram {
    public static void main(String[] args) {
        smallCat c = new smallCat();
        c.makeSounds();
    }
}