package com.gfarkas.data_structures.bitset;

import java.util.*;
import java.util.function.BiConsumer;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int numberOfOperations = sc.nextInt();

        BitSet[] bitSets = new BitSet[]{new BitSet(size), new BitSet(size)};

        Map<String, BiConsumer<Integer, Integer>> operations = new HashMap<>();
        operations.put("AND", (index1, index2) -> bitSets[index1 - 1].and(bitSets[index2 - 1]));
        operations.put("OR", (index1, index2) -> bitSets[index1 - 1].or(bitSets[index2 - 1]));
        operations.put("XOR", (index1, index2) -> bitSets[index1 - 1].xor(bitSets[index2 - 1]));
        operations.put("SET", (index1, index2) -> bitSets[index1 - 1].set(index2));
        operations.put("FLIP", (index1, index2) -> bitSets[index1 - 1].flip(index2));

        for (int i = 0; i < numberOfOperations; i++) {

            // The java.util.BitSet.cardinality() method returns the number of bits set to true in this BitSet.
            operations.get(sc.next()).accept(sc.nextInt(), sc.nextInt());
            System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());

        }
    }

}

