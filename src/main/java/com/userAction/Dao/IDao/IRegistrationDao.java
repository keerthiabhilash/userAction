package com.userAction.Dao.IDao;

import com.userAction.Bo.customerBo.CustomerBo;
import com.userAction.Bo.customerBo.RegistrationForm;
import com.userAction.Bo.userBo.UserLoginBo;

public interface IRegistrationDao {
	
	public int saveRegistrationForm(CustomerBo rf);

	public UserLoginBo getUserFromUserName(String user);

}
