import java.awt.Color;

public class MyPoint {
    int x; // Координата x
    int y; // Координата y
    double radius; // Розмір точки (радіус)
    Color color; // Колір точки

    // Конструктор за замовчуванням
    public MyPoint() {
        this.x = 0;
        this.y = 0;
        this.radius = 1.0; // по КД
        this.color = Color.BLACK; // засуджую
    }

    // Конструктор з параметрами
    public MyPoint(int x, int y, double radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = Math.max(radius, 0); // Радіус не може бути менше 0
        this.color = color;
    }

    // Методи-аксесори для отримання координат та радіусу
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // Метод для отримання рядкового представлення об'єкта
    public String getInfo() {
        return "Point at (" + x + ", " + y + "), Radius: " + radius + ", Color: " + color;
    }

    // Метод для обчислення відстані від початку координат до точки
    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Метод для обчислення відстані до іншої точки
    public double distanceToPoint(MyPoint otherPoint) {
        int dx = x - otherPoint.getX();
        int dy = y - otherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static void main(String[] args) {
        MyPoint point = new MyPoint();
        point.x = 3;
        point.y = 4;
        point.radius = 2.5;
        point.color = Color.RED;
    
        System.out.println(point.getInfo()); // Виведе інформацію про точку
    }
}
