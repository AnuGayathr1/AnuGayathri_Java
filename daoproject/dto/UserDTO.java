package daoproject.dto;

import java.io.Serializable;
import java.util.Objects;

public class UserDTO implements Comparable<UserDTO>,Serializable{
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	public UserDTO(int uid, int flag, String uname, String upass) {
		super();
		this.uid = uid;
		this.flag = flag;
		this.uname = uname;
		this.upass = upass;
	}
	private int uid,flag;
	private String uname,upass;
	@Override
	public int compareTo(UserDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	@Override
	public int hashCode() {
		return Objects.hash(flag, uid, uname, upass);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return flag == other.flag && uid == other.uid && Objects.equals(uname, other.uname)
				&& Objects.equals(upass, other.upass);
	}
	@Override
	public String toString() {
		return "UserDTO [uid=" + uid + ", flag=" + flag + ", uname=" + uname + ", upass=" + upass + "]";
	}
}