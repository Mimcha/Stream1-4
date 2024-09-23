package org.example;

public class Worker {
    private OnTaskDoneListener callback;

    // Конструктор принимает callback типа OnTaskDoneListener
    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    // Метод для моделирования выполнения задач
    public void start() {
        for (int i = 0; i < 100; i++) {
            // Здесь мы вызываем метод onDone() для каждой выполненной задачи
            callback.onDone("Task " + i + " is done");
        }
    }
}
