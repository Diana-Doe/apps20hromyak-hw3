package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        array = smartArray.toArray();
        int end = smartArray.size();
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (array[i].equals(array[j])) {
                    int shift = j;
                    for (int k = j+1; k < end; k++, shift++) {
                        array[shift] = array[k];
                    }
                    end--;
                    j--;
                }
            }
        }
        array = Arrays.copyOf(array, end);
    }

    public String operationDescription() {
        return "Distinct decorator is applied\n";
    }

}
