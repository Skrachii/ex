package l12inheritance.ex5;

import java.util.ArrayList;
import java.util.Collections;

public class ShapeInventory {

    private ArrayList<Shape> inventory = new ArrayList<>();

    public void add(Shape s){
        inventory.add(s);
    }

    public void displayInventory(){
        Collections.sort(inventory);
        for ( Shape s : inventory) {
            System.out.println(s.shapeDetails());
        }
    }
}
