package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();
        firstSet.forEach(elem -> {
            if (secondSet.contains(elem) && !thirdSet.contains(elem)) resultSet.add(elem);
        } );
        thirdSet.forEach(elem -> {
            if (!firstSet.contains(elem) && !secondSet.contains(elem)) resultSet.add(elem);
        });

        return resultSet;
    }
}
