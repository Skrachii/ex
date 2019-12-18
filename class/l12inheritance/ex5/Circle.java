package l12inheritance.ex5;

public class Circle extends AbstractShape {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }



    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String shapeDetails() {
        return String.format("Circle: radius = %.2f; " +
                        "Perimeter = %.2f; " +
                        "Area= %.2f; ",
                radius, calculatePerimeter(), calculateArea());

    }


}
