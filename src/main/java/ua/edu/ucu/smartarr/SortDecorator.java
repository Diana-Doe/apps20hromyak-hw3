package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{
    public SortDecorator(SmartArray smartArray, MyComparator comp) {
        super(smartArray);
        array = Arrays.stream(smartArray.toArray()).sorted(comp).toArray();
    }

    public String operationDescription() {
        return "Sort decorator is applied\n";
    }

}
