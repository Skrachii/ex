package emil.l12Inheritance;

import l12inheritance.ex5.Rectangle;
import l12inheritance.ex5.ShapeInventory;

public class Ex5 {
    public static void main(String[] args) {
        ShapeInventory inventory = new ShapeInventory();

        inventory.add(new Rectangle(2, 5));
        inventory.add(new Rectangle(3, 2));
        inventory.add(new Rectangle(6, 7));

        inventory.displayInventory();
    }
}

