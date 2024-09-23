package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Определяем listener через лямбда-выражение
        OnTaskDoneListener listener = System.out::println;

        // Создаем экземпляр класса Worker и передаем listener в конструктор
        Worker worker = new Worker(listener);

        // Запускаем выполнение задач
        worker.start();
    }
}