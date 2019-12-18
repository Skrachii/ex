package l12inheritance.ex5;

public abstract class AbstractShape implements Shape {

    @Override
    public int compareTo(Shape o) {
        if( calculateArea() < o.calculateArea() )
            return -1;
        else if( calculateArea() > o.calculateArea() )
            return 1;
        else
            return 0;
    }
}
