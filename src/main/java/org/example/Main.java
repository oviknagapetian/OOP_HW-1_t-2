package org.example;

public class Main {
    public static void main(String[] args) {
        Прямоугольник прямоугольник1 = new Прямоугольник(); // Создаем прямоугольник с шириной и высотой по умолчанию
        Прямоугольник прямоугольник2 = new Прямоугольник(5.0, 3.0); // Создаем прямоугольник с заданными значениями

        // Выводим свойства и результаты вычислений на консоль
        System.out.println("Прямоугольник 1: Ширина = " + прямоугольник1.getWidth() + ", Высота = " + прямоугольник1.getHeight());
        System.out.println("Площадь прямоугольника 1: " + прямоугольник1.calculateArea());
        System.out.println("Периметр прямоугольника 1: " + прямоугольник1.calculatePerimeter());

        System.out.println("Прямоугольник 2: Ширина = " + прямоугольник2.getWidth() + ", Высота = " + прямоугольник2.getHeight());
        System.out.println("Площадь прямоугольника 2: " + прямоугольник2.calculateArea());
        System.out.println("Периметр прямоугольника 2: " + прямоугольник2.calculatePerimeter());
    }
}
