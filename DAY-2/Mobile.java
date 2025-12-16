package edu.mce.it.model;

public class Mobile {

    int mobileid;
    String branchname;
    String ownername;
    double price;

    
    public Mobile(int mobileid, String branchname, String ownername, double price) {
        this.mobileid = mobileid;
        this.branchname = branchname;   
        this.ownername = ownername;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-10d%-15s%-15s%-15.2f",
                this.mobileid,
                this.branchname,
                this.ownername,
                this.price);
    }
}
