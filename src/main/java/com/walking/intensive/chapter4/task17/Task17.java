package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int [] array = {5, 8, 100, -50, -121, 0, 98, 58, 159, 65};
        System.out.println(Arrays.toString(sortByBubble(array)));

    }

    private static int[] sortByBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp;
            for (int j = 0; j < array.length - i; j++) {
                if (array [j] > array [j + 1]) {
                   temp = array [j];
                   array [j] = array [j + 1];
                   array [j + 1] = temp;
                }
            }
        }
        return array;
    }
}