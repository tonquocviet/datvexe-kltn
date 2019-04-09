package model.bo;

import java.util.ArrayList;

import form.UserForm;
import model.bean.User;
import model.dao.UserDAO;

public class UserBO {

	public User checkLogin(String username, String password) {
		UserDAO userDAO = new UserDAO();
		return userDAO.checkLogin(username,password);
	}

	

	public int getRowCountUser() {
		UserDAO userDAO = new UserDAO();
		return userDAO.getRowCountUser();
	}

	public ArrayList<User> getPaginationUsers(int i) {
		UserDAO userDAO = new UserDAO();
		return userDAO.getPaginationUsers(i);
	}



	public ArrayList<User> getPeddingPaginationUsers(int i) {
		UserDAO userDAO = new UserDAO();
		return userDAO.getPeddingPaginationUsers(i);
	}



	public boolean register(UserForm userForm) {
		UserDAO userDAO = new UserDAO();
		return userDAO.register(userForm);
	}

	public User getOneUser(String username) {
		UserDAO userDAO = new UserDAO();
		return userDAO.getOneUser(username);
	
	}



	public User checkIfTransporterExist(String username) {
		UserDAO userDAO = new UserDAO();
		return userDAO.checkIfTransporterExist(username);
	}
	
	
	
	
	public User changePassword(int uID, String newPassword) {
		UserDAO userDAO = new UserDAO();
		return userDAO.changePassword(uID, newPassword);
	}
	public User getPassword(int uid) {
		UserDAO userDAO = new UserDAO();
		return userDAO.getPassword(uid);
	}



	public boolean removeUser(int id) {
		UserDAO userDAO = new UserDAO();
		return userDAO.removeUser(id);
	}
	
	public User getUserById(int id) {
		UserDAO userDAO = new UserDAO();
		return userDAO.getUserById(id);
	}
	
	public User updateUserInformation(int maNguoiDung, String userName, String password, int phanQuyen,
			String tenNguoiDung, String phone, String diaChi, String email, boolean trangThai) {
		UserDAO userDAO = new UserDAO();
		return userDAO.updateUserInformation(maNguoiDung, userName, password, phanQuyen, tenNguoiDung, phone, diaChi,
				email, trangThai);
	}
	
	
	
	public void ChangeInfo( int userId,String username, String tenNguoiDung, String soDienThoai, String diaChi, String email) {
		UserDAO userDAO = new UserDAO();
		userDAO.ChangeInfo(userId,username,tenNguoiDung,soDienThoai,diaChi,email);
	}



	public ArrayList<User> getConfirmUser() {
		
		UserDAO userDAO = new UserDAO();
		return userDAO.getConfirmUser();
	}



	public void confirm(int maNguoiDung) {
		UserDAO userDAO = new UserDAO();
		userDAO.confirm(maNguoiDung);
	}
	
	public User getInfUser(int id){
		UserDAO userDAO = new UserDAO();
		return userDAO.getInforUser(id);
	}



	public ArrayList<User> getPeddingPaginationConfirmUsers(int i) {
		UserDAO userDAO = new UserDAO();
		return userDAO.getPeddingPaginationConfirmUsers(i);
	}



	public int getRowCountPenddingUser() {
		UserDAO userDAO = new UserDAO();
		return userDAO.getRowCountPenddingUser();
	}



	public void RegisterTransport(int userId, String noiDungPheDuyet) {
		UserDAO userDAO = new UserDAO();
		userDAO.RegisterTransport(userId,noiDungPheDuyet);
	
		
	}
	
}



