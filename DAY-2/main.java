package edu.mce.it;

import edu.mce.it.model.Mobile;

public class Main {

    public static void main(String[] args) {
        Mobile m1 = new Mobile(1, "Poco", "Bala", 25000.00);
        Mobile m2 = new Mobile(2, "Realme", "Bala", 27000.00);

        System.out.println(m1);
        System.out.println(m2);
    }
}
