import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape3DInterface[] shapes = new Shape3DInterface[10];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3);
            if (shapeType == 0) {
                shapes[i] = new Sphere();
            } else if (shapeType == 1) {
                shapes[i] = new Cylinder();
            } else {
                shapes[i] = new Cube();
            }
        }

        System.out.println("Generated 3D Shapes and their properties:");
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n%n", shape.volume());
        }
    }
}
