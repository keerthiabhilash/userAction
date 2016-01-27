package com.userAction.Bo.userBo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name = "USER_ROLE_TBL", schema = "useraction")
public class UserRoleBo {

    @Id
    @GeneratedValue
    @Column(name = "USER_ROLE_ID")
    private int userRoleId;

    @Column(name = "USER_ROLE_NAME", nullable = false)
    private String userRoleName;

    @Column(name = "USER_FUNCTION")
    private String userFuntions;

    @Column(name = "INSERT_TMS", nullable = false)
    private DateTime insertTime;

    @Column(name = "LST_UPDATE_TMS")
    private DateTime lastUpdateTime;

    @OneToOne
    @JoinColumn(name = "USER_LOGIN_ID")
    private UserLoginBo userLoginBo;

    public UserLoginBo getUserLoginBo() {
        return userLoginBo;
    }

    public void setUserLoginBo(UserLoginBo userLoginBo) {
        this.userLoginBo = userLoginBo;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public String getUserFuntions() {
        return userFuntions;
    }

    public void setUserFuntions(String userFuntions) {
        this.userFuntions = userFuntions;
    }

    public DateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(DateTime insertTime) {
        this.insertTime = insertTime;
    }

    public DateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(DateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


}
