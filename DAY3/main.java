package edu.mce.it;

import edu.mce.it.model.Mobile;
import edu.mce.it.service.MobileService;
import java.util.*;

public class Main {
    static void main() {
        MobileService mobileService=new MobileService();
        mobileService.getMobiles();
    }
}
