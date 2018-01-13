package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;
import java.util.List;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private MyPredicate pr;

    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {
        super(smartArray);
        this.pr = pr;
    }

    @Override
    public Object[] toArray() {
        Object[] prev = this.smartArray.toArray();
        List<Object> result = new ArrayList<>();

        for (Object aPrev : prev) {
            if (pr.test(aPrev)) {
                result.add(aPrev);
            }
        }

        return result.toArray(new Object[result.size()]);
    }

    @Override
    public String operationDescription() {
        return "Filter elements with filter passed as strategy";
    }
}

