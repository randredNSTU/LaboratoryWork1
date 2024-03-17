# RU
# Калькулятор треугольника

Это программа разработанна на языке программирования Java, с целью выполнения различных вычислений, связанных с треугольниками. Основные функции включают в себя вычисление периметра, площади треугольника по формуле Герона и проверку треугольника на равнобедренность.

## Требования

- Установленная Java Development Kit (JDK) на вашем компьютере.
- Любая среда разработки на Java или текстовый редактор (например, IntelliJ IDEA, Eclipse, Visual Studio Code) для просмотра и редактирования кода.

## Как использовать

1. Клонируйте репозиторий на свой компьютер или загрузите файл `Triangle.java` напрямую.
2. Откройте файл в выбранной вами среде разработки на Java или текстовом редакторе.
3. Скомпилируйте и запустите файл `Triangle.java`.
4. Следуйте инструкциям на экране для ввода длин трех сторон треугольника.
5. Программа выведет периметр, площадь и информацию о том, является ли треугольник равнобедренным.

## Описание классов

### `Triangle`

#### Переменные

- `private double sideA`: Длина стороны A треугольника.
- `private double sideB`: Длина стороны B треугольника.
- `private double sideC`: Длина стороны C треугольника.

#### Конструкторы

- `public Triangle(double sideA, double sideB, double sideC)`: Создает новый объект треугольника с заданными длинами сторон.

#### Методы

- `public double calculatePerimeter()`: Вычисляет периметр треугольника.
- `public double calculateArea()`: Вычисляет площадь треугольника по формуле Герона.
- `public boolean isIsosceles()`: Проверяет, является ли треугольник равнобедренным.

### `Main`

#### Методы

- `public static void main(String[] args)`: Точка входа в программу. Считывает длины сторон треугольника от пользователя, создает объект `Triangle`, вычисляет и выводит периметр, площадь и информацию о равнобедренности треугольника.

## Пример ввода/вывода

```
Введите длину стороны A:
3
Введите длину стороны B:
4
Введите длину стороны C:
5
Периметр треугольника: 12.0
Площадь треугольника: 6.0
Треугольник равнобедренный: false
```
# EN
# Triangle calculator

This program is developed in Java programming language for the purpose of performing various calculations related to triangles. Basic functions include calculating the perimeter, area of a triangle using Heron's formula, and testing the triangle for isosceles.

## Requirements

- Java Development Kit (JDK) installed on your computer.
- Any Java development environment or text editor (for example, IntelliJ IDEA, Eclipse, Visual Studio Code) for viewing and editing code.

## How to use

1. Clone the repository to your computer or download the `Triangle.java` file directly.
2. Open the file in your Java development environment or text editor of choice.
3. Compile and run the `Triangle.java` file.
4. Follow the onscreen instructions to enter the lengths of the three sides of the triangle.
5. The program will display the perimeter, area, and information about whether the triangle is isosceles.

## Description of classes

### `Triangle`

#### Variables

- `private double sideA`: Length of side A of the triangle.
- `private double sideB`: Length of side B of the triangle.
- `private double sideC`: Length of side C of the triangle.

#### Constructors

- `public Triangle(double sideA, double sideB, double sideC)`: Creates a new triangle object with the given side lengths.

#### Methods

- `public double calculatePerimeter()`: Calculates the perimeter of a triangle.
- `public double calculateArea()`: Calculates the area of a triangle using Heron's formula.
- `public boolean isIsosceles()`: Checks whether the triangle is isosceles.

### `Main`

#### Methods

- `public static void main(String[] args)`: The entry point to the program. Reads the lengths of the sides of a triangle from the user, creates a `Triangle` object, calculates and displays the perimeter, area and isosceles information of the triangle.

## Example I/O

```
Enter the length of side A:
3
Enter the length of side B:
4
Enter the length of side C:
5
Triangle perimeter: 12.0
Triangle area: 6.0
Isosceles triangle: false
```

# RU

# Калькулятор прямоугольника

Это программа разработанна на языке программирования Java, с целью выполнения различных вычислений, связанных с прямоугольниками. Основные функции включают в себя вычисление периметра, площади и длины диагонали прямоугольника.

## Требования

- Установленная Java Development Kit (JDK) на вашем компьютере.
- Любая среда разработки на Java или текстовый редактор (например, IntelliJ IDEA, Eclipse, Visual Studio Code) для просмотра и редактирования кода.

## Как использовать

1. Клонируйте репозиторий на свой компьютер или загрузите файл `Rectangle.java` напрямую.
2. Откройте файл в выбранной вами среде разработки на Java или текстовом редакторе.
3. Скомпилируйте и запустите файл `Rectangle.java`.
4. Программа выведет периметр, площадь и длину диагонали прямоугольника.

## Описание классов

### `Rectangle`

#### Переменные

- `private double width`: Ширина прямоугольника.
- `private double height`: Высота прямоугольника.

#### Конструкторы

- `public Rectangle(double width, double height)`: Создает новый объект прямоугольника с заданной шириной и высотой.

#### Методы

- `public double calculatePerimeter()`: Вычисляет периметр прямоугольника.
- `public double calculateArea()`: Вычисляет площадь прямоугольника.
- `public double calculateDiagonal()`: Вычисляет длину диагонали прямоугольника.

### `Main`

#### Методы

- `public static void main(String[] args)`: Точка входа в программу. Создает объект `Rectangle` с заданными значениями ширины и высоты, вычисляет и выводит периметр, площадь и длину диагонали прямоугольника.

## Пример ввода/вывода

```
Периметр прямоугольника: 30.0
Площадь прямоугольника: 50.0
Длина диагонали прямоугольника: 11.180339887498949
```

# EN
# Rectangle calculator

It is a program developed in Java programming language for the purpose of performing various calculations related to rectangles. Basic functions include calculating the perimeter, area and diagonal length of a rectangle.

## Requirements

- Java Development Kit (JDK) installed on your computer.
- Any Java development environment or text editor (for example, IntelliJ IDEA, Eclipse, Visual Studio Code) for viewing and editing code.

## How to use

1. Clone the repository to your computer or download the `Rectangle.java` file directly.
2. Open the file in your Java development environment or text editor of choice.
3. Compile and run the `Rectangle.java` file.
4. The program will display the perimeter, area and diagonal length of the rectangle.

## Description of classes

### `Rectangle`

#### Variables

- `private double width`: The width of the rectangle.
- `private double height`: The height of the rectangle.

#### Constructors

- `public Rectangle(double width, double height)`: Creates a new rectangle object with the given width and height.

#### Methods

- `public double calculatePerimeter()`: Calculates the perimeter of a rectangle.
- `public double calculateArea()`: Calculates the area of a rectangle.
- `public double calculateDiagonal()`: Calculates the diagonal length of a rectangle.

### `Main`

#### Methods

- `public static void main(String[] args)`: The entry point to the program. Creates a `Rectangle` object with the given width and height values, calculates and displays the perimeter, area and diagonal length of the rectangle.

## Example I/O

```
Rectangle perimeter: 30.0
Rectangle area: 50.0
Rectangle diagonal length: 11.180339887498949
```