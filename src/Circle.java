public class Circle extends Shape implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle circle) {
        if(this.radius>circle.getRadius()) return 1;
        else if(this.radius<circle.getRadius()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
