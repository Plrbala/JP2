package edu.mce.it;

import edu.mce.it.model.Mobile;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner din=new Scanner(System.in);
        System.out.println("enter the mobileid");
        int id=din.nextInt();
        System.out.println("enter the brandname ");
        String bn=din.next();
        System.out.println("enter the ownername ");
        String on=din.next();
        System.out.println("enter the price ");
        double p=din.nextDouble();
        Mobile m1=new Mobile(id,bn,on,p);
        System.out.println(m1);

    }
}
