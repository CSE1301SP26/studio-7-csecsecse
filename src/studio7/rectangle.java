package src.studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {


    private double width;
    private double height;
    private double x;
    private double y;

    public rectangle(double w, double h){
        width = w;
        height = h;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return width * height;
    }

    public boolean isSquare(){
        return width == height;
    }

    public boolean compare(rectangle other){
        return this.getArea() < other.getArea();
    }


    public static void main(String[] args){

        rectangle a = new rectangle(4.0,4.0);
        System.out.println(a.isSquare());
        System.out.println(a.getWidth());

    }

}
