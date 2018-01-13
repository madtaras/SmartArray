package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.ArrayList;
import java.util.List;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    private MyFunction func;

    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        this.func = func;
    }

    @Override
    public Object[] toArray() {
        Object[] prev = this.smartArray.toArray();
        List<Object> result = new ArrayList<>();

        for (Object aPrev : prev) {
            result.add(func.apply(aPrev));
        }

        return result.toArray(new Object[result.size()]);
    }

    @Override
    public String operationDescription() {
        return "Modify elements";
    }
}
