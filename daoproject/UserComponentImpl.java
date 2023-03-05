package daoproject;
import daoproject.dao.UserDAO;
import daoproject.dao.UserDAOImpl;
import daoproject.dto.UserDTO;

public class UserComponentImpl implements UserComponent,Cloneable{

	private static UserComponentImpl usercom;
	public static UserComponentImpl getUserComponentImplObject() {
		if(usercom==null) {
			usercom=new UserComponentImpl();
			return usercom;
		}
		else {
			return usercom.createClone();
		}
	}
	private UserComponentImpl createClone() {
		if(usercom!=null) {
			try{
				return (UserComponentImpl)super.clone();
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
	private UserComponentImpl() {
		// TODO Auto-generated constructor stub
	}
	private UserDAO userdao;
	
	@Override
	public boolean checkUser(String uname, String upass) {
		// TODO Auto-generated method stub
		userdao=UserDAOImpl.getUserDAOImplObject();
		UserDTO dto=userdao.findUserByName(uname);
		if(dto!=null) {
			if(dto.getUpass().equals(upass)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkFlag(String uname) {
		userdao=UserDAOImpl.getUserDAOImplObject();
		UserDTO dto=userdao.findUserByName(uname);
		if(dto!=null) {
			if(dto.getFlag()==0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int updateFlag(String uname, int flag) {
		userdao=UserDAOImpl.getUserDAOImplObject();
		UserDTO dto=userdao.findUserByName(uname);
		if(dto!=null) {
			dto.setFlag(flag);
			int n=userdao.updateUser(dto);
			return n;
		}
		else {
			return 0;
		}
	}
	
}