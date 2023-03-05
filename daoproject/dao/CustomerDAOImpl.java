package daoproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.dto.CustomerDTO;
import daoproject.dto.UserDTO;

public class CustomerDAOImpl extends CustomerDAO implements Cloneable {
	private static CustomerDAOImpl customerdao;
	public static CustomerDAOImpl getCustomerDAOImplObject() {
		if(customerdao==null) {
			customerdao=new CustomerDAOImpl();
			return customerdao;
		}
		else {
			return customerdao.createClone();
		}
	}
	private CustomerDAOImpl createClone() {
		// TODO Auto-generated method stub
		if(customerdao!=null) {
			try {
				return(CustomerDAOImpl)super.clone();
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
	private CustomerDAOImpl() {
		
	}@Override
	public CustomerDTO findCustomerByID(int cid) {
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from customer_master where cid=?");
			ps.setInt(1, cid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				CustomerDTO customerdto=new CustomerDTO();
				customerdto.setCid(cid);
				customerdto.setCname(rs.getString("cname"));
				customerdto.setCaddress(rs.getString("caddress"));
				return customerdto;
			}
			else {
				return null;
			}
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	@Override
	public CustomerDTO findCustomerByName(String cname) {
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from customer_master where cname=?");
			ps.setString(1, cname);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				CustomerDTO customerdto=new CustomerDTO();
				customerdto.setCid(rs.getInt("uid"));
				customerdto.setCname(cname);
				customerdto.setCaddress(rs.getString("caddress"));
				return customerdto;
			}
			else {
				return null;
			}
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	@Override
	public Collection<CustomerDTO> findAll() {
		try {
			Connection con=DBUtility.getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from customer_master");
			List<CustomerDTO> customers=new ArrayList<CustomerDTO>();
			if(rs.next()) {
				CustomerDTO customerdto=new CustomerDTO();
				customerdto.setCid(rs.getInt("cid"));
				customerdto.setCname(rs.getString("cname"));
				customerdto.setCaddress(rs.getString("caddress"));
				customers.add(customerdto);
			}
			return customers;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}@Override
	public int updateCustomer(CustomerDTO cdto) {
		try {
			Connection con=DBUtility.getConnection();
			int cid=cdto.getCid();
			PreparedStatement ps=con.prepareStatement("select * from customer_master where cid=?");
			ps.setInt(1, cid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update customer_master set cname=?,caddress=? where cid=?");
				CustomerDTO customerdto=new CustomerDTO();
				ps.setString(1, customerdto.getCname());
				ps.setString(2, customerdto.getCaddress());
				ps.setInt(3, customerdto.getCid());
				int n=ps.executeUpdate();
				DBUtility.closeConnection(null);
				return n;
			}
			else {
				return 0;
			}
			}catch(Exception e) {
				e.printStackTrace();
				DBUtility.closeConnection(e);
				return 0;
			}
	}@Override
	public int deleteCustomerByID(int cid) {
		try {
		    Connection con=DBUtility.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from customer_master where cid=?");
            ps.setInt(1, cid);
            int n = ps.executeUpdate();
            DBUtility.closeConnection(null);
            return n;
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}
	@Override
	public int deleteCustomerByName(String cname) {
		try {
		    Connection con=DBUtility.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from customer_master where cname=?");
            ps.setString(1, cname);
            int n = ps.executeUpdate();
            DBUtility.closeConnection(null);
            return n;
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}
	public static void main(String[] args) {
		CustomerDAO customer=new CustomerDAOImpl();
		System.out.println(customer.findCustomerByID(1));
		System.out.println(customer.findCustomerByName("somu"));
		CustomerDTO c=customer.findCustomerByID(1);
		c.setCname("ramu");
		c.setCaddress("chennai");
		int n=customer.updateCustomer(c);
		System.out.println(customer.deleteCustomerByID(1));
	}
}
