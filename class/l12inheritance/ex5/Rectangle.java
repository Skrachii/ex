package l12inheritance.ex5;

public class Rectangle implements Shape{
    private double width;
    private double height;

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
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public String shapeDetails() {
        return String.format("Rectangle: Width= %.2f; Height= %.2f;" +
                "Perimeter= %.2f;" +
                "Area= %.2f; "
                + width,height,calculatePerimeter(),calculateArea());
    }

    @Override
    public int compareTo(Shape o) {
        return 0;
    }
}

//public class Rectangle extends AbstractShape {
//    private double width;
//    private double height;
//
//    public Rectangle( double width, double height ){
//        this.width = width;
//        this.height = height;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    @Override
//    public double calculatePerimeter() {
//
//        return 2 * (height + width);
//    }
//
//    @Override
//    public double calculateArea() {
//        return height*width;
//    }
//
//    @Override
//    public String shapeDetails() {
//        return String.format("Rectangle: width = %.2f; " +
//                "height = %.2f; " +
//                "Perimeter = %.2f; " +
//                "Area= %.2f; ",
//                width, height, calculatePerimeter(), calculateArea());
//    }
//}
