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

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return this.x;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            Utility.error("Unzulässiger Radius. Bitte erneut eingeben.");
        } else {
            this.radius = radius;
        }
    }
}