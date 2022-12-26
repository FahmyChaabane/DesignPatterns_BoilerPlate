package structural.flyweight;

public class Point {
    private int x; // 4 bytes
    private int y; // 4 bytes
    // private PointType pointType; // 4 bytes
    // // this icon a general icon that is related to a point type
    // private byte[] icon; // 20 kb // if we have 100 icons, it will cost around 10 MB
    private PointIcon icon;

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw() {
        System.out.println();
        System.out.printf("%s at (%d, %d)", icon.getPointType(), x, y);
    }
    
}
