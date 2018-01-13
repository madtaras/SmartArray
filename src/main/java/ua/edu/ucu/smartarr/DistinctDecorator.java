package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.HashSet;
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
        List<Object> listWithoutDuplicates = new ArrayList();

        for (Object aPrev : prev) {
            boolean shouldAdd = true;
            for (Object obj : result) {
                if (aPrev.equals(obj)) {
                    shouldAdd = false;
                }
            }
            if (shouldAdd) {
                result.add(aPrev);
            }
            listWithoutDuplicates = new ArrayList<>(new HashSet<>(result));
        }

        return listWithoutDuplicates.toArray(new Object[listWithoutDuplicates.size()]);
    }

    @Override
    public String operationDescription() {
        return "Remove duplicate elements";
    }
}
