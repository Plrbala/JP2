package edu.mce.it.model;

public class Mobile {


    private  int mobileid;
    private String brandname;
    private String ownername;
    private double price;

    public int getMobileid() {
        return mobileid;
    }

    public void setMobileid(int mobileid) {
        this.mobileid = mobileid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBranchname(String brandname) {
        this.brandname = brandname;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Mobile(int mobileid, String brandname, String ownername, double price) {
        this.mobileid = mobileid;
        this.brandname = brandname;
        this.ownername = ownername;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-10d%-15s%-15s%-15.2f",
                this.mobileid,
                this.brandname,
                this.ownername,
                this.price);
    }
}
