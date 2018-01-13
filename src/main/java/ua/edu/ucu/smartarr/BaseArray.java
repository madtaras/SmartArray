package ua.edu.ucu.smartarr;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// Base array for decorators
public class BaseArray<T> implements SmartArray {
    private T[] nums;

    public BaseArray (T[] nums) {
        this.nums = nums;
    }

    public Object[] toArray() {
        return this.nums;
    }

    public String operationDescription() {
        return "Base array";
    }

    public int size() {
        return nums.length;
    }
}
