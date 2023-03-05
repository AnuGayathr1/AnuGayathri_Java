package daoproject.dao;

import java.util.Collection;

import daoproject.dto.InvoiceTransDTO;

public abstract class InvoiceTransDAO {
	public abstract InvoiceTransDTO findTransactByInvoiceNo(int invoice_no);
	public abstract InvoiceTransDTO findTransactByItemNo(int item_no);
	public abstract Collection<InvoiceTransDTO> findAll();
	public abstract int updateTransact(InvoiceTransDTO invoicetransdto);
	public abstract int deleteTransactByInvoiceNo(int invoice_no);
	public abstract int deleteTransactByItemNo(int item_no);
}