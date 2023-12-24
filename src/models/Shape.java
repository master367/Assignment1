package models;

import java.util.ArrayList;

public class Shape {

    private final ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimeter += points.get(i).getDistance(points.get(i + 1));
        }

        perimeter += points.get(points.size() - 1).getDistance(points.get(0));

        return perimeter;
    }

    public double getLongestSide() {
        double longSide = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            int nextIndex = (i + 1) % points.size();
            double sideLength = points.get(i).getDistance(points.get(nextIndex));

            if (sideLength > longSide) {
                longSide = sideLength;
            }
        }

        return longSide;
    }

    public double getAverageSide() {
        double cnt = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            cnt += points.get(i).getDistance(points.get(i + 1));
        }

        cnt += points.get(points.size() - 1).getDistance(points.get(0));

        return cnt / points.size();
    }

    @Override
    public String toString() {
        return "Perimeter: " + calculatePerimeter() + "\n" + "Longest side: " + getLongestSide() + "\n" +
                "Average side: " + getAverageSide();
    }

}
