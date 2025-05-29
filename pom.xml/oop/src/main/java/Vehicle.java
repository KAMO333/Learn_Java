public class Vehicle {
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;

    Vehicle() {
        color = "blue";
    }

    public void horn() {
        System.out.println("Beep!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colour) {
        this.color = colour;
    }
}