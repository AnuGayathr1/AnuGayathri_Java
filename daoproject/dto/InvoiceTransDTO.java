package daoproject.dto;

import java.io.Serializable;
import java.util.Objects;

public class InvoiceTransDTO implements Comparable<InvoiceTransDTO>, Serializable{
	private int invoice_no,item_no,item_qty;

	@Override
	public int compareTo(InvoiceTransDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(int invoice_no) {
		this.invoice_no = invoice_no;
	}

	public int getItem_no() {
		return item_no;
	}

	public void setItem_no(int item_no) {
		this.item_no = item_no;
	}

	public int getItem_qty() {
		return item_qty;
	}

	public void setItem_qty(int item_qty) {
		this.item_qty = item_qty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(invoice_no, item_no, item_qty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceTransDTO other = (InvoiceTransDTO) obj;
		return invoice_no == other.invoice_no && item_no == other.item_no && item_qty == other.item_qty;
	}

	@Override
	public String toString() {
		return "InvoiceTransDTO [invoice_no=" + invoice_no + ", item_no=" + item_no + ", item_qty=" + item_qty + "]";
	}

	public InvoiceTransDTO(int invoice_no, int item_no, int item_qty) {
		super();
		this.invoice_no = invoice_no;
		this.item_no = item_no;
		this.item_qty = item_qty;
	}
	public InvoiceTransDTO() {
		// TODO Auto-generated constructor stub
	}
}
