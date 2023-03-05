package daoproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.dto.InvoiceTransDTO;

public class InvoiceTransDAOImpl extends InvoiceTransDAO implements Cloneable {
	private static InvoiceTransDAOImpl transdao;
	public static InvoiceTransDAOImpl getTransactDAOImplObject() {
		if(transdao==null) {
			transdao=new InvoiceTransDAOImpl();
			return transdao;
		}
		else {
			return transdao.createClone();
		}
	}
	private InvoiceTransDAOImpl createClone() {
		if(transdao!=null) {
			try{
				return (InvoiceTransDAOImpl)super.clone();
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
	private InvoiceTransDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public InvoiceTransDTO findTransactByInvoiceNo(int invoice_no) {
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoice_trans where invoice_no=?");
			ps.setInt(1, invoice_no);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				InvoiceTransDTO invoicedto=new InvoiceTransDTO();
				invoicedto.setInvoice_no(invoice_no);
				invoicedto.setItem_no(rs.getInt("item_no"));
				invoicedto.setItem_qty(rs.getInt("item_qty"));
				return invoicedto;
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
	public InvoiceTransDTO findTransactByItemNo(int item_no) {
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoice_trans where item_no=?");
			ps.setInt(1, item_no);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				InvoiceTransDTO invoicedto=new InvoiceTransDTO();
				invoicedto.setInvoice_no(rs.getInt("invoice_no"));
				invoicedto.setItem_no(item_no);
				invoicedto.setItem_qty(rs.getInt("item_qty"));
				return invoicedto;
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
	public Collection<InvoiceTransDTO> findAll() {
		try {
			Connection con=DBUtility.getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from invoice_trans");
			List<InvoiceTransDTO> transact=new ArrayList<InvoiceTransDTO>();
			if(rs.next()) {
				InvoiceTransDTO invoicedto=new InvoiceTransDTO();
				invoicedto.setItem_no(rs.getInt("item_no"));
				invoicedto.setInvoice_no(rs.getInt("invoice_no"));
				invoicedto.setItem_qty(rs.getInt("item_qty"));
				transact.add(invoicedto);
			}
			return transact;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	@Override
	public int updateTransact(InvoiceTransDTO intransdto) {
		try {
			Connection con=DBUtility.getConnection();
			int invoice_no=intransdto.getInvoice_no();
			PreparedStatement ps=con.prepareStatement("select * from invoice_trans where invoice_no=?");
			ps.setInt(1, invoice_no);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update invoice_trans set item_no=?,item_qty=? where invoice_no=?");
				InvoiceTransDTO invoicedto=new InvoiceTransDTO();
				ps.setInt(1, invoicedto.getItem_no());
				ps.setInt(2, invoicedto.getItem_qty());
				ps.setInt(3, invoicedto.getInvoice_no());
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
	public int deleteTransactByInvoiceNo(int invoice_no) {
		try {
		    Connection con=DBUtility.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from invoice_trans where invoice_no=?");
            ps.setInt(1, invoice_no);
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
	public int deleteTransactByItemNo(int item_no) {
		try {
		    Connection con=DBUtility.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from invoice_trans where item_no=?");
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
		InvoiceTransDAO transact=new InvoiceTransDAOImpl();
		System.out.println(transact.findTransactByInvoiceNo(201));
		InvoiceTransDTO i=transact.findTransactByItemNo(101);
		i.setItem_qty(10);
		int n=transact.updateTransact(i);
		System.out.println(transact.deleteTransactByInvoiceNo(202));
	}
}
