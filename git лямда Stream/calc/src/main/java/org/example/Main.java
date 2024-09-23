package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // объясните причину возникновения ошибки, в чем заключается ошибка и
        // способы ее решения. Напишите реализацию, в которой предусмотрите обработку возникающей ошибки.
        //  Причина возникновения ошибки
        //  Если мы попытаемся выполнить деление на ноль, например, когда `b` равно 0, это вызовет
        //  `IllegalArgumentException`, так как в методе `devide` предусмотрена проверка на деление
        //  на ноль. Это приведет к следующему коду:
        // Способы решения проблемы
        /*
        1. **Проверка на ноль**: Всегда проверять, не равно ли делимое нулю, перед выполнением деления.
        2. **Обработка исключений**: Использовать блоки `try-catch` для обработки исключений, чтобы
        предотвратить аварийное завершение программы и предоставить пользователю понятное сообщение об ошибке.
       */
        try {
            int c = calc.devide.apply(a, b); // Здесь b равно 0
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            // Обработка исключения
            System.err.println("Ошибка: Деление на ноль невозможно.");
        }
    }
}