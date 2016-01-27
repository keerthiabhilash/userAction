package com.userAction.Dao;

import com.userAction.Bo.userBo.UserLoginBo;
import com.userAction.Dao.IDao.IUserLoginDao;
import com.userAction.controller.UserLogin;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ${AbhilashKeerthi} on 1/9/16.
 */
@Repository("userLoginDao")
public class UserLoginDao extends AbstractDao implements IUserLoginDao {

    @Transactional
    public UserLoginBo findUserByUserName(final String userName){

        UserLoginBo userLogin = (UserLoginBo) this.getResultsFromQuerrywithEquals
                        (null,
                        UserLoginBo.class,
                        (Map<String, String>) new HashMap<>().put("userName",userName)).get(0);
        return userLogin;
    }
}
