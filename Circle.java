public class Circle {

    private int x;
    private int y;
    private int radius;

    private Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static Circle newCircle(int x, int y, int radius) {
        return new Circle(x, y, radius);
    }

    public Circle clone() {
        return new Circle(this.x, this.y, this.radius);
    }
}
