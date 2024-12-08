import java.util.Random;

public class Cube implements Shape3DInterface {
    private double side;

    public Cube() {
        Random random = new Random();
        this.side = 1 + random.nextDouble() * 9;
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return String.format("Cube (Side Length: %.2f)", side);
    }
}
