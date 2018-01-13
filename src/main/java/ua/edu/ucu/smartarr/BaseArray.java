package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {
    private ArrayList<Integer> nums;

    public BaseArray (Integer[] nums) {
        this.nums = new ArrayList<>(Arrays.asList(nums)); ;
    }

    public Object[] toArray() {
        return nums.toArray(new Integer[nums.size()]);
    }

    public String operationDescription() {
        // TODO: implement this shit
        return "TODO";
    }

    public int size() {
        return nums.size();
    }
}
