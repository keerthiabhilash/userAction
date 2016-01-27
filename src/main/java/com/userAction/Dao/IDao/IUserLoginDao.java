package com.userAction.Dao.IDao;

import com.userAction.Bo.userBo.UserLoginBo;
import com.userAction.controller.UserLogin;

/**
 * Created by ${AbhilashKeerthi} on 1/9/16.
 */
public interface IUserLoginDao {

public UserLoginBo findUserByUserName(String userName);


}
