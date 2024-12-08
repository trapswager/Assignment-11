import java.util.Random;

public class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;

    public Cylinder() {
        Random random = new Random();
        this.radius = 1 + random.nextDouble() * 9;
        this.height = 5 + random.nextDouble() * 15;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder (Radius: %.2f, Height: %.2f)", radius, height);
    }
}
