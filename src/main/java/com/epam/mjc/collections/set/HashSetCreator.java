package com.epam.mjc.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultList = new LinkedHashSet<>();
        sourceList.forEach(num -> {
            if (num % 2 == 0) processEven(num, resultList);
            else processOdd(num, resultList);
        });

        return resultList;
    }
    private void processEven(Integer num, HashSet<Integer> list) {
        while (num % 2 == 0) {
            list.add(num);
            num /= 2;
        }
        list.add(num);
    }
    private void processOdd(Integer num, HashSet<Integer> list) {
        list.add(num);
        list.add(2 * num);
    }

}
