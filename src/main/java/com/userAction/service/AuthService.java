package com.userAction.service;


import com.userAction.Bo.userBo.UserLoginBo;
import com.userAction.Dao.IDao.IRegistrationDao;
import com.userAction.Dao.RegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by ${AbhilashKeerthi} on 1/21/16.
 */
@Service("authService")
public class AuthService {

    @Autowired
    @Qualifier("registrationDao")
    IRegistrationDao registrationDao;

    public UserLoginBo getUserFromUserID(String userName){

        UserLoginBo userCredentials =  registrationDao.getUserFromUserName(userName);

        return userCredentials;
    }
}
