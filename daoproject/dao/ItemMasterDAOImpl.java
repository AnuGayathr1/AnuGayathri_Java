package daoproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.dto.ItemMasterDTO;

public class ItemMasterDAOImpl extends ItemMasterDAO implements Cloneable {
	private static ItemMasterDAOImpl itemdao;
	public static ItemMasterDAOImpl getItemMasterDAOImplObject() {
		if(itemdao==null) {
			itemdao=new ItemMasterDAOImpl();
			return itemdao;
		}
		else {
			return itemdao.createClone();
		}
	}
	private ItemMasterDAOImpl createClone() {
		if(itemdao!=null) {
			try{
				return (ItemMasterDAOImpl)super.clone();
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
	private ItemMasterDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ItemMasterDTO findItemByNo(int item_no) {
		try {
		Connection con=DBUtility.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from item_master where item_no=?");
		ps.setInt(1, item_no);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			ItemMasterDTO itemdto=new ItemMasterDTO();
			itemdto.setItem_no(item_no);
			itemdto.setItem_desc(rs.getString("item_desc"));
			itemdto.setItem_price(rs.getInt("item_price"));
			itemdto.setItem_unit(rs.getString("item_unit"));
			return itemdto;
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
	public Collection<ItemMasterDTO> findAll() {
		try {
			Connection con=DBUtility.getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from item_master");
			List<ItemMasterDTO> items=new ArrayList<ItemMasterDTO>();
			if(rs.next()) {
				ItemMasterDTO itemdto=new ItemMasterDTO();
				itemdto.setItem_no(rs.getInt("item_no"));
				itemdto.setItem_desc(rs.getString("item_desc"));
				itemdto.setItem_price(rs.getInt("item_price"));
				itemdto.setItem_unit(rs.getString("item_unit"));
				items.add(itemdto);
			}
			return items;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	@Override
	public int updateItem(ItemMasterDTO idto) {
		try {
			Connection con=DBUtility.getConnection();
			int item_no=idto.getItem_no();
			PreparedStatement ps=con.prepareStatement("select * from item_master where item_no=?");
			ps.setInt(1, item_no);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update users set item_desc=?,item_price=?,item_unit=? where item_no=?");
				ItemMasterDTO itemdto=new ItemMasterDTO();
				ps.setString(1, itemdto.getItem_desc());
				ps.setInt(2, itemdto.getItem_price());
				ps.setString(3, itemdto.getItem_unit());
				ps.setInt(4, itemdto.getItem_no());
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
	}
	@Override
	public int deleteItemByNo(int item_no) {
		try {
		    Connection con=DBUtility.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from item_master where item_no=?");
            ps.setInt(1, item_no);
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
		ItemMasterDAO item=new ItemMasterDAOImpl();
		System.out.println(item.findItemByNo(101));
		ItemMasterDTO i=item.findItemByNo(102);
		i.setItem_price(100);
		i.setItem_unit("g");
		int n=item.updateItem(i);
		System.out.println(item.deleteItemByNo(101));
	}
}
