public class Vehicle {
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;

    Vehicle() {
        this.setColor("Blue");
    }

    Vehicle(String color){
        this.setColor(color);
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

    @Override
    public String toString() {
        return color;
    }

}