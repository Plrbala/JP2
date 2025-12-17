package edu.mce.it.service;

import edu.mce.it.model.Mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MobileService {
    List<Mobile> mobiles=new ArrayList<>(
            Arrays.asList(
                    new Mobile(1,"poco","xxx",2500.00),
                    new Mobile(2,"realme","yyy",3500.00),
                    new Mobile(3,"oppo","aaa",2500.00)
            )
    );
    public void getMobiles()
    {
        for(Mobile m:mobiles)
        {
           System.out.println(m);
        }
    }

    public void addMobile(Mobile mobile)
    {
        mobiles.add(mobile);
        System.out.println("mobile data added successfully");
    }
    public void updateMobile(int mobileid,String brandname,
                             String ownername,double price)
    {
        boolean found =false;
        for(Mobile m:mobiles)
        {
            if(m.getMobileid()==mobileid)
            {
                m.setBrandname(brandname);
                m.setOwnername(ownername);
                m.setPrice(price);
                found=true;
                System.out.println("mobile updated successfully");
                break;
            }
        }
        if(!found)
        {
            System.out.println("mobile id not found");
        }
    }
    public void deleteMobile(int mobileid)
    {
        Iterator<Mobile> iterator=mobiles.iterator();
        boolean found=false;
        while(iterator.hasNext())
        {
            Mobile m=iterator.next();
            if(m.getMobileid()==mobileid)
            {
                iterator.remove();
                found=true;
                System.out.println("mobile delete successfully");
                break;
            }
        }
        if(!found)
        {
            System.out.println("id not found");
        }
    }

}

