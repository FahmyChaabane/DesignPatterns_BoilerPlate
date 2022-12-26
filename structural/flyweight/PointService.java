package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {

    PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    // in real app, this method would call a backend to get a list of points of a database.
    public List<Point> getPoints() {
        List<Point> points = new ArrayList<Point>();
        Point point = new Point(12, 32, iconFactory.getPointIcon(PointType.CAFE));
        points.add(point);
        return points;
    }
}
