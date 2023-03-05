package daoproject.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.dto.InvoiceMasterDTO;
import daoproject.dto.ItemMasterDTO;

public class InvoiceMasterDAOImpl extends InvoiceMasterDAO implements Cloneable{
	private static InvoiceMasterDAOImpl invoicedao;
	public static InvoiceMasterDAOImpl getInvoiceDAOImplObject() {
		if(invoicedao==null) {
			invoicedao=new InvoiceMasterDAOImpl();
			return invoicedao;
		}
		else {
			return invoicedao.createClone();
		}
	}
	private InvoiceMasterDAOImpl createClone() {
		if(invoicedao!=null) {
			try{
				return (InvoiceMasterDAOImpl)super.clone();
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
	private InvoiceMasterDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public InvoiceMasterDTO findInvoiceByNo(int invoice_no) {
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoice_master where invoice_no=?");
			ps.setInt(1, invoice_no);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				InvoiceMasterDTO invoicedto=new InvoiceMasterDTO();
				invoicedto.setInvoice_no(invoice_no);
				invoicedto.setCid(rs.getInt("cid"));
				invoicedto.setDate(rs.getDate("date"));
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
	public InvoiceMasterDTO findInvoiceByID(int cid) {
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoice_master where cid=?");
			ps.setInt(1, cid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				InvoiceMasterDTO invoicedto=new InvoiceMasterDTO();
				invoicedto.setCid(cid);
				invoicedto.setInvoice_no(rs.getInt("invoice_no"));
				invoicedto.setDate(rs.getDate("date"));
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
	public Collection<InvoiceMasterDTO> findAll() {
		try {
			Connection con=DBUtility.getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from invoice_master");
			List<InvoiceMasterDTO> invoice=new ArrayList<InvoiceMasterDTO>();
			if(rs.next()) {
				InvoiceMasterDTO invoicedto=new InvoiceMasterDTO();
				invoicedto.setCid(rs.getInt("cid"));
				invoicedto.setInvoice_no(rs.getInt("invoice_no"));
				invoicedto.setDate(rs.getDate("date"));
				invoice.add(invoicedto);
			}
			return invoice;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	@Override
	public int updateInvoice(InvoiceMasterDTO indto) {
		try {
			Connection con=DBUtility.getConnection();
			int invoice_no=indto.getInvoice_no();
			PreparedStatement ps=con.prepareStatement("select * from invoice_master where invoice_no=?");
			ps.setInt(1, invoice_no);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update invoice_master set cid=?,date=? where invoice_no=?");
				InvoiceMasterDTO invoicedto=new InvoiceMasterDTO();
				ps.setInt(1, invoicedto.getCid());
				ps.setDate(2, (Date) invoicedto.getDate());
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
	public int deleteInvoiceByNo(int invoice_no) {
		try {
		    Connection con=DBUtility.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from invoice_master where invoice_no=?");
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
	public int deleteInvoiceByID(int cid) {
		try {
		    Connection con=DBUtility.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from invoice_master where cid=?");
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
	public static void main(String[] args) {
		InvoiceMasterDAO invoice=new InvoiceMasterDAOImpl();
		System.out.println(invoice.findInvoiceByNo(1));
		InvoiceMasterDTO i=invoice.findInvoiceByID(1);
		i.setDate(null);
		int n=invoice.updateInvoice(i);
		System.out.println(invoice.deleteInvoiceByNo(1));
	}
}
