package Polyogon;

public class Triangle implements IArea , IParameter{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getArea() {
        double p = getParameter()/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
    @Override
    public double getParameter(){
        return a+b+c;
    }
}
