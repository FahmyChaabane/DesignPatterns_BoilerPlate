package structural.flyweight;

public class PointIcon {
    private final PointType pointType; // 4 bytes
    private final byte[] icon; // 20 kb 

    public PointIcon(PointType pointType, byte[] icon) {
        this.pointType = pointType;
        this.icon = icon;
    }

    public PointType getPointType() {
        return pointType;
    }

    // to get rid of the warning
    public byte[] getIcon() {
        return icon;
    }

}
