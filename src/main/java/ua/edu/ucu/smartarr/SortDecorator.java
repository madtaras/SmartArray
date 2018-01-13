package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    private MyComparator cmp;

    public SortDecorator(SmartArray smartArray, MyComparator cmp) {
        super(smartArray);
        this.cmp = cmp;
    }

    @Override
    public Object[] toArray() {
        Object[] result = this.smartArray.toArray();
        Arrays.sort(result);

        return result;
    }

    @Override
    public String operationDescription() {
        return "Sort elements";
    }
}
