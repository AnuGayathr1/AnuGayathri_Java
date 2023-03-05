package daoproject.dto;

import java.io.Serializable;
import java.util.Objects;

public class CustomerDTO implements Comparable<CustomerDTO>,Serializable{
	private int cid;
	private String cname,caddress;
	@Override
	public int compareTo(CustomerDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	@Override
	public int hashCode() {
		return Objects.hash(caddress, cid, cname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDTO other = (CustomerDTO) obj;
		return Objects.equals(caddress, other.caddress) && cid == other.cid && Objects.equals(cname, other.cname);
	}
	@Override
	public String toString() {
		return "CustomerDTO [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + "]";
	}
	public CustomerDTO(int cid, String cname, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}
	public CustomerDTO() {
		// TODO Auto-generated constructor stub
	}
	
}
