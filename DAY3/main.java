package edu.mce.it;

import edu.mce.it.model.Mobile;
import edu.mce.it.service.MobileService;
import java.util.*;

public class Main {
    static void main() {
        MobileService mobileService=new MobileService();
        Scanner din=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\n ---mobile CRUD MENU---");
            System.out.println("1. ADD new Mobile");
            System.out.println("2. View Mobiles");
            System.out.println("3.EXIT");
            System.out.println("enter the choice");
            choice=din.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("enter the mobileid");
                    int id=din.nextInt();
                    System.out.println("enter the brandname ");
                    String bn=din.next();
                    System.out.println("enter the ownername ");
                    String on=din.next();
                    System.out.println("enter the price ");
                    double p=din.nextDouble();
                    mobileService.addMobile(new Mobile(id,bn,on,p));
                    break;
                }
                case 2:
                {
                    mobileService.getMobiles();
                    break;
                }
                case 3:
                {
                    break;
                }
    }
}
