package daoproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.dto.UserDTO;
import daoproject.dao.DBUtility;

public class UserDAOImpl extends UserDAO implements Cloneable{
	private static UserDAOImpl userdao;
	public static UserDAOImpl getUserDAOImplObject() {
		if(userdao==null) {
			userdao=new UserDAOImpl();
			return userdao;
		}
		else {
			return userdao.createClone();
		}
	}
	private UserDAOImpl createClone() {
		if(userdao!=null) {
			try{
				return (UserDAOImpl)super.clone();
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
	private UserDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDTO findUserByID(int uid) {
		try {
		Connection con=DBUtility.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from users where uid=?");
		ps.setInt(1, uid);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			UserDTO dto=new UserDTO();
			dto.setUid(uid);
			dto.setUname(rs.getString("uname"));
			dto.setUpass(rs.getString("upass"));
			dto.setFlag(rs.getInt("flag"));
			return dto;
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
	public UserDTO findUserByName(String uname) {
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from users where uname=?");
			ps.setString(1, uname);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				UserDTO dto=new UserDTO();
				dto.setUid(rs.getInt("uid"));
				dto.setUname(uname);
				dto.setUpass(rs.getString("upass"));
				dto.setFlag(rs.getInt("flag"));
				return dto;
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
	public Collection<UserDTO> findAll() {
		try {
			Connection con=DBUtility.getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from users");
			List<UserDTO> users=new ArrayList<UserDTO>();
			if(rs.next()) {
				UserDTO dto=new UserDTO();
				dto.setUid(rs.getInt("uid"));
				dto.setUname(rs.getString("uname"));
				dto.setUpass(rs.getString("upass"));
				dto.setFlag(rs.getInt("flag"));
				users.add(dto);
			}
			return users;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}

	@Override
	public int updateUser(UserDTO userdto) {
		try {
			Connection con=DBUtility.getConnection();
			int uid=userdto.getUid();
			PreparedStatement ps=con.prepareStatement("select * from users where uid=?");
			ps.setInt(1, uid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update users set uname=?,upass=?,flag=? where uid=?");
				UserDTO dto=new UserDTO();
				ps.setString(1, userdto.getUname());
				ps.setString(2, userdto.getUpass());
				ps.setInt(3, userdto.getFlag());
				ps.setInt(4, userdto.getUid());
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
	public int deleteUserByID(int uid) {
		   try {
			    Connection con=DBUtility.getConnection();
	            PreparedStatement ps = con.prepareStatement("delete from users where uid=?");
	            ps.setInt(1, uid);
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
	public int deleteUserByName(String uname) {
		 try {
			    Connection con=DBUtility.getConnection();
	            PreparedStatement ps = con.prepareStatement("delete from users where uname=?");
	            ps.setString(1, uname);
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
		UserDAO user=new UserDAOImpl();
		System.out.println(user.findUserByID(1));
		
		System.out.println(user.findUserByName("somu"));
		
		
		UserDTO u=user.findUserByID(1);
		u.setUname("ramu");
		u.setUpass("secret");
		int n=user.updateUser(u);
		System.out.println(user.deleteUserByID(1));
	}

}
