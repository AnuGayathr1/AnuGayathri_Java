package daoproject.dao;

import java.util.Collection;

import daoproject.dto.InvoiceMasterDTO;

public abstract class InvoiceMasterDAO {
	public abstract InvoiceMasterDTO findInvoiceByNo(int invoice_no);
	public abstract InvoiceMasterDTO findInvoiceByID(int cid);
	public abstract Collection<InvoiceMasterDTO> findAll();
	public abstract int updateInvoice(InvoiceMasterDTO invoicedto);
	public abstract int deleteInvoiceByNo(int cid);
	public abstract int deleteInvoiceByID(int invoice_no);
}
