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
            System.out.println("3. update");
            System.out.println("4.delete");
            System.out.println("5.exit");
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
                    System.out.println("enter the mobileid to update");
                    int uid=din.nextInt();
                    System.out.println("enter the brandname ");
                    String ubn=din.next();
                    System.out.println("enter the ownername ");
                    String uon=din.next();
                    System.out.println("enter the price ");
                    double up=din.nextDouble();
                    mobileService.updateMobile(uid,ubn,uon,up);
                    break;
                }
                case 4:
                {
                    System.out.println("enter the mobileid to delete");
                    int did=din.nextInt();
                    mobileService.deleteMobile(did);
                    break;
                }
                case 5:
                {
                    break;
                }


            }

        }
        while(choice !=5);

    }
}
