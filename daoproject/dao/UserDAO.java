package daoproject.dao;

import java.util.Collection;

import daoproject.dto.UserDTO;

public abstract class UserDAO{
	public abstract UserDTO findUserByID(int uid);
	public abstract UserDTO findUserByName(String uname);
	public abstract Collection<UserDTO> findAll();
	public abstract int updateUser(UserDTO userdto);
	public abstract int deleteUserByID(int uid);
	public abstract int deleteUserByName(String uname);
}