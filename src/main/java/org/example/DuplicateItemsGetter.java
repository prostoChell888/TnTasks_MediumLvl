package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * return list of duplicate items
 */
public class DuplicateItemsGetter {

    /**
     * @param list of anu Elements
     * @return list of duplicate items
     */
    public static <T> List<T> getDuplicates(List<T> list) {
        Map<T, Integer> countMap = new HashMap<>();

        for (var el : list) {
            countMap.merge(el, 1, Integer::sum);
        }

        List<T> listOfDuplicate = new ArrayList<T>();
        for (var entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                listOfDuplicate.add(entry.getKey());
            }
        }

        return listOfDuplicate;
    }


}