public class Overload {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        point.method();
        point.method(42);
        point.method(101.1);
        Point2D.method("java"); // вызов статического метода через класс
    }
}
