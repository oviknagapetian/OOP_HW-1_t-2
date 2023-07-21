package org.example;

public class Прямоугольник {
    private double width; // Ширина прямоугольника
    private double height; // Высота прямоугольника

    // Конструктор без параметров, создает прямоугольник с шириной и высотой по умолчанию
    public Прямоугольник() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Конструктор, который принимает значения ширины и высоты
    public Прямоугольник(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Геттеры и сеттеры для свойств ширины и высоты
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Метод "вычислить площадь", возвращает площадь прямоугольника (ширина * высота)
    public double calculateArea() {
        return width * height;
    }

    // Метод "вычислить периметр", возвращает периметр прямоугольника (2 * (ширина + высота))
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
