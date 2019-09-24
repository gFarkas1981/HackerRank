package com.gfarkas.data_structures.dequeue;

import java.io.InputStream;
import java.util.*;

public class Solution {

    private static Deque<Integer> window = new LinkedList<>();
    private static Map<Integer, Integer> counter = new HashMap<>();

    public static int solution(InputStream is) {

        try (Scanner scanner = new Scanner(is)) {

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            assert m <= n;

            window.clear();
            counter.clear();

            for (int i = 0; i < m; i++) {

                int in = scanner.nextInt();
                window.add(in);
                counter.merge(in, 1, Integer::sum);

            }

            int result = counter.size();

            for (int i = m; i < n && result < m; i++) {
                Integer out = window.remove();
                Integer in = scanner.nextInt();
                window.add(in);

                if (out.intValue() != in.intValue()) {

                    counter.merge(in, 1, Integer::sum);
                    counter.merge(out, -1, (a, b) -> a == 1 ? null : a + b);

                    result = Math.max(result, counter.size());

                }
            }

            return result;
        }
    }

    public static void main(String[] args) {

        System.out.println(solution(System.in));

    }
}