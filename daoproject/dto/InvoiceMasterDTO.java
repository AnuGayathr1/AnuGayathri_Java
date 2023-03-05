package daoproject.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class InvoiceMasterDTO implements Comparable<InvoiceMasterDTO>,Serializable{
	private int invoice_no,cid;
	private Date date;
	@Override
	public int compareTo(InvoiceMasterDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(int invoice_no) {
		this.invoice_no = invoice_no;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cid, date, invoice_no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceMasterDTO other = (InvoiceMasterDTO) obj;
		return cid == other.cid && Objects.equals(date, other.date) && invoice_no == other.invoice_no;
	}
	@Override
	public String toString() {
		return "InvoiceMasterDTO [invoice_no=" + invoice_no + ", cid=" + cid + ", date=" + date + "]";
	}
	public InvoiceMasterDTO(int invoice_no, int cid, Date date) {
		super();
		this.invoice_no = invoice_no;
		this.cid = cid;
		this.date = date;
	}
	
	public InvoiceMasterDTO() {
		// TODO Auto-generated constructor stub
	}
	
}
