package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {

    private Map<PointType, PointIcon> icons = new HashMap<PointType, PointIcon>();
    // we will simulate having a cache
    public PointIcon getPointIcon(PointType pointType) {
        if(!icons.containsKey(pointType)) {
            // in real app, we would get the icon from calling fs or somewhere.
            icons.put(pointType, new PointIcon(pointType, null));
        }        
        
        return icons.get(pointType);
        
    }
    
}
