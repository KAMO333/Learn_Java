package practice;

public class Block {
    private int[] numbers;

    public Block(int[] numbers) {
        this.numbers = numbers;
    }

    public int getWidth() {
        return numbers[0];
    }

    public int getLength() {
        return numbers[1];
    }

    public int getHeight() {
        return numbers[2];
    }

    public int getVolume() {
        return getLength() * getWidth() * getHeight();
    }

    public int getSurfaceArea() {
        return 2 * (getLength() * getWidth() + getWidth() * getHeight() + getHeight() * getLength());
    }
}
