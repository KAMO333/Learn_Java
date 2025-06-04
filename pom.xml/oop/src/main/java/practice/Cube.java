package practice;

public class Cube{
    private int sides;

    public Cube() {
        this.sides = 0;
    }

    public Cube(int number) {
        convertNegativeToPositive(number);
    }

    public int getSide() {
        return sides;
    }

    public void setSide(int number) {
        convertNegativeToPositive(number);
    }

    public void convertNegativeToPositive(int number) {
        if(number < 0) {
            this.sides = number * -1;
        } else {
            this.sides = number;
        }
    }
}