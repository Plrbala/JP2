public class Mobile {


    private  int mobileid;
    private String branchname;
    private String ownername;
    private double price;

    public int getMobileid() {
        return mobileid;
    }

    public void setMobileid(int mobileid) {
        this.mobileid = mobileid;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
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

