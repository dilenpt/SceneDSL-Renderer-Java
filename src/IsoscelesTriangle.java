import java.awt.*;

class IsoscelesTriangle extends SolidPolygon {
    public IsoscelesTriangle(Color color, Point topVertex, int height, int width) {
        super(color, 3);
        int x1 = topVertex.x - width / 2;
        int x2 = topVertex.x + width / 2;
        int y1 = topVertex.y + height;
        int y2 = topVertex.y + height;
        int[] x_points = {topVertex.x, x1, x2};
        int[] y_points = {topVertex.y, y1, y2};
        createPolygon(x_points, y_points);
    }
}
