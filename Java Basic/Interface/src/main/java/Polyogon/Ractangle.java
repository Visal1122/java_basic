package Polyogon;

public class Ractangle implements Polygon{

    private double width;
    private double height;

    public Ractangle(double width, double height) {

        this.width = width;
        this.height = height;
    }

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
    @Override
    public String toString() {
        return "Ractangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    @Override
    public double getArea(){

        return width*height;
    };

    @Override
    public double getParameter() {
        return (width+height)*2;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
    public void info(){
        System.out.println("This is from Rectangle");
    }
}
