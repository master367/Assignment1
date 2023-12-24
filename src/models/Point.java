package models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(Point dest){
        double x2 = dest.getX() - getX();
        double y2 = dest.getY() - getY();

        return Math.sqrt(x2*x2 + y2*y2);
    }
}
