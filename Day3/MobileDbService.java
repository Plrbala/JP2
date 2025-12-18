package edu.mce.it.service;

import edu.mce.it.DbUtil;
import edu.mce.it.model.Mobile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MobileDbService {
    public MobileDbService()
    {
        createTable();
    }
    public void createTable()
    {
        String sql= """ 
                CREATE TABLE IF NOT EXISTS mobile(
                mobileid INT PRIMARY KEY,
                brandname TEXT,
                ownername TEXT,
                price REAL)
                """;
        try(Connection con= DbUtil.getConnection();
            Statement st=con.createStatement())
        {
            st.execute(sql);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void addMobile(Mobile m)
    {
        String sql="INSERT INTO mobile VALUES(?,?,?,?)";
        try(Connection con= DbUtil.getConnection();
            PreparedStatement ps=con.prepareStatement(sql))
        {
            ps.setInt(1,m.getMobileid());
            ps.setString(2,m.getBrandname());
            ps.setString(3,m.getOwnername());
            ps.setDouble(4,m.getPrice());
            ps.executeUpdate();
            System.out.println("mobile added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void getMobiles() {
        String sql = "SELECT * FROM mobile";
        try (Connection con = DbUtil.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            System.out.println("\n ID  Brand  Owner  price");
            while (rs.next()) {
                System.out.printf("%-10d %-15s %-15s %.2f%n",
                        rs.getInt("mobileid"),
                        rs.getString("brandname"),
                        rs.getString("ownername"),
                        rs.getDouble("price"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateMobile
            (int mobileid,String brandname,
             String ownername,double price)
    {
        String sql="UPDATE mobile SET brandname=?,ownername=?,price =? where mobileid=?" ;
        try(Connection con= DbUtil.getConnection();
            PreparedStatement ps=con.prepareStatement(sql))
        {
            ps.setString(1,brandname);
            ps.setString(2,ownername);
            ps.setDouble(3,price);
            ps.setInt(4,mobileid);
            int r=ps.executeUpdate();
            System.out.println(r>0 ? "mobile update":"Mobile not found");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
public void deleteMobile(int mobileid)
{
    String sql="DELETE FROM mobile where mobileid=? ";
    try(Connection con= DbUtil.getConnection();
        PreparedStatement ps=con.prepareStatement(sql))
    {
        ps.setInt(1,mobileid);
        int r=ps.executeUpdate();
        System.out.println(r>0?"mobile deleted":"Not Found");
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
}
