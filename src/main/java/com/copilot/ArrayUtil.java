package com.copilot;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayUtil {

    // method arrayDemo to create prime numbers till 20
    public void arrayDemo() {
        int n = 20;
        int[] arr = new int[n];
        int k = 0;
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                arr[k] = i;
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /* method arrayDemoStream to create prime numbers till 20 using java 8 streams api
     * auto import required classes by pressing ctrl+shift+o
     */
    public void arrayDemoStream() {
        int n = 20;
        List<Integer> list = IntStream.range(2, n)
                .filter(i -> IntStream.range(2, i).allMatch(j -> i % j != 0))
                .boxed()
                .collect(Collectors.toList());
        list.forEach(i -> System.out.print(i + " "));

    }


}
