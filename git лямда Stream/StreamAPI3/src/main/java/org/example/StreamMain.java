package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Используем Stream API для фильтрации и сортировки
        Stream<Integer> stream = intList.stream()
                .filter(x -> x > 0) // Фильтруем положительные числа
                .filter(x -> x % 2 == 0) // Находим четные числа
                .sorted(); // Сортируем по возрастанию

        // Выводим результат
        stream.forEach(System.out::println);
    }
}
