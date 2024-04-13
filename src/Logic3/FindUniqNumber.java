package Logic3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUniqNumber {
    public static Double findUniq(double [] arr){

        Map<Double, Integer> countMap = new HashMap<>();

        // Count occurrences of each value
        for (double num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the unique value
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no unique value found, return 0
        return (double) 0;

    }

    public static void main(String[] args) {
        System.out.println(FindUniqNumber.findUniq(new double[]{0.0, 0.0, 0.55, 0.0, 0.0 }));
    }

}
