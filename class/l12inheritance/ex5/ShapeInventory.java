package l12inheritance.ex5;

import java.util.ArrayList;

public class ShapeInventory {

    private ArrayList<Shape> inventory = new ArrayList<>();

    public void add(Shape s){
        inventory.add(s);
    }

    public void displayInventory(){
        for ( Shape s : inventory) {
            System.out.println(s.shapeDetails());
        }
    }
}
