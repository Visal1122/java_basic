package Polyogon;

public class PolygonApp {
    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle(10 , 30);
        System.out.println(ractangle);
        Triangle triangle = new Triangle(3 , 4, 5);
        System.out.println(triangle.getArea());
    }
}
