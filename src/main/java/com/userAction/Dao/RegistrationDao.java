package com.userAction.Dao;

import com.userAction.Bo.userBo.UserLoginBo;
import com.userAction.Bo.util.CountryAndState;
import com.userAction.controller.UserLogin;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.userAction.Bo.customerBo.CustomerBo;
import com.userAction.Bo.customerBo.RegistrationForm;
import com.userAction.Dao.IDao.IRegistrationDao;

import java.util.HashMap;
import java.util.Map;


@Repository("registrationDao")
public class RegistrationDao extends AbstractDao implements IRegistrationDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public int saveRegistrationForm(CustomerBo rf) {
		this.saveObject(rf);		
		return 0;
	}

	@Override
	public UserLoginBo getUserFromUserName(String userNme) {

		UserLoginBo stats = (UserLoginBo) this.getResultsFromQuerrywithEquals
						(null, UserLoginBo.class,(Map<String, String>) new HashMap<>().put("userName", userNme)).get(0);

		return stats;
	}


}

