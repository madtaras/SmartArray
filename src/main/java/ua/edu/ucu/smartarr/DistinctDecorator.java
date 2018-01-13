package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.List;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        Object[] prev = this.smartArray.toArray();
        List<Object> result = new ArrayList<>();

        for (Object aPrev : prev) {
            if (!result.contains(aPrev)) {
                result.add(aPrev);
            }
        }

        return result.toArray(new Object[result.size()]);
    }

    @Override
    public String operationDescription() {
        return "Remove duplicate elements";
    }
}
