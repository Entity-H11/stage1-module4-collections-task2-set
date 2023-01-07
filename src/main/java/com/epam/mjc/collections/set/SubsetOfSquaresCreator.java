package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> resultSet = new TreeSet<>();
        sourceList.forEach(num -> {
            int square = (int) Math.pow(num,2);
            if (lowerBound <= square && upperBound >= square) resultSet.add(square);
        });

        return resultSet;
    }
}
