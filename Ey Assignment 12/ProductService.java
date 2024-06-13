package com.ey.jdbc.task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProductService {
	public void addProduct(Product product) throws Exception {
		Connection con=DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into product values(?,?)");
			pst.setInt(1, product.id);
			pst.setString(2, product.name);
			pst.execute();//run
		}
	public void updateProduct(int id1 , String a) throws Exception{
		Connection con =DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("update product set name=? where id=?");
		pst.setString(1, a);
		pst.setInt(2,id1);
		pst.execute();
		
	
	}
	public void deleteProduct(int id) throws Exception {
		Connection con =DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("delete from product where id=?");
		pst.setInt(1,id);
		pst.execute();
		
		
	}
	  public List<Product> getAllProducts() throws Exception{
      	Connection con=DbConn.getConnection();
			Statement pst=con.createStatement();
			ResultSet rs=pst.executeQuery("select * from Product");
			List<Product> plist=new ArrayList<>();
			while(rs.next()) {
				Product p=new Product (rs.getInt(1),rs.getString(2));
				plist.add(p);
			}
      	return plist;
      	
      }
      public Product getOneProduct(int id1) throws Exception
		
		{
			Connection con=DbConn.getConnection();
			PreparedStatement pst=con.prepareStatement("select*from Product where id=?");
			pst.setInt(1, id1);
			ResultSet rs=pst.executeQuery();
			Product p=null;
			while(rs.next()) {
				p=new Product(rs.getInt(1),rs.getString(2));
			}
			return p;
		
		}


}
