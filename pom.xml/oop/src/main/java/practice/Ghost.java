package practice;

import java.util.Random;

public class Ghost {
    private String color;

    public Ghost() {
        String[] colors = {"white", "red", "yellow", "purple"};
        Random rand = new Random();
        this.color = colors[rand.nextInt(colors.length)];
    }

    public String getColor() {
        return color;
    }
}
