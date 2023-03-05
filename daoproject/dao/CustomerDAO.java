package daoproject.dao;

import java.util.Collection;

import daoproject.dto.CustomerDTO;

public abstract class CustomerDAO {
	public abstract CustomerDTO findCustomerByID(int uid);
	public abstract CustomerDTO findCustomerByName(String uname);
	public abstract Collection<CustomerDTO> findAll();
	public abstract int updateCustomer(CustomerDTO customerdto);
	public abstract int deleteCustomerByID(int uid);
	public abstract int deleteCustomerByName(String uname);
}
