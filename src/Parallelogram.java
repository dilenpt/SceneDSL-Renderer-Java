import java.awt.*;

class Parallelogram extends SolidPolygon {
    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int xOffset) {
        super(color, 4);
        int[] x_points = {upperLeft.x, lowerRight.x + xOffset, lowerRight.x, upperLeft.x - xOffset};
        int[] y_points = {upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y};
        createPolygon(x_points, y_points);
    }
}
