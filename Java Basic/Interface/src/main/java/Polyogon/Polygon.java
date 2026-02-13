package Polyogon;

public interface Polygon extends IArea , IParameter{
    public void draw();
    default void info(){
        System.out.println("This is from Polygon");
    };
}
