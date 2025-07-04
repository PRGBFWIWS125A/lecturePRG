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
        return this.radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            Utility.error("Unzulässiger Radius. Bitte erneut eingeben.");
        } else {
            this.radius = radius;
        }
    }
    
    public static double size(final Circle... circles) {
        double res = 0;
        for (final Circle r : circles) {
            res += r.singleSize();
        }
        return res;
    }

    private boolean containsOne(final Circle that) {
        final double distance = Utility.distance(this.x, this.y, that.x, that.y);
        return this.radius >= that.radius + distance;
    }

    private double singleSize() {
        return this.radius * this.radius * Utility.PI;
    }

    public boolean contains(final Circle... others) {
        for (final Circle o : others) {
            if (!this.containsOne(o)) {
                return false;
            }
        }
        return true;
    }


    @Override
    public String toString() {
        return String.format("(%d|%d),%d",getX(),getY(),getRadius());
    }

    public void performAction(CircleAction action){
        switch(action){
            case UP:
                this.y-=10;
                break;
            case DOWN:
                this.y+=10;
                break;
            case LEFT:
                this.x-=10;
                break;
            case RIGHT:
                this.x+=10;
                break;
            case BIGGER:
                this.radius+=10;
                break;
            case SMALLER:
                this.setRadius(this.getRadius() - 10);
                break;
        }
    }

}