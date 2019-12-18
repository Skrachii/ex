package l12inheritance.ex5;

public interface Shape extends Comparable<Shape>{
    public double calculatePerimeter();
    public double calculateArea();
    public String shapeDetails();
}
