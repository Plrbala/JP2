package edu.mce.it.service;

import edu.mce.it.model.Mobile;

import java.util.ArrayList;
import java.util.Arrays;
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
}
