package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbers = new ArrayList<>();

        // Фильтруем положительные числа
        for (Integer number : intList) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }

        // Находим четные числа
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : positiveNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        // Сортируем числа
        Collections.sort(evenNumbers);

        // Выводим результат
        for (Integer number : evenNumbers) {
            System.out.println(number);
        }
    }
}