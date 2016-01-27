package com.userAction.service;

import org.springframework.security.core.GrantedAuthority;


import org.springframework.security.core.GrantedAuthority;

import java.util.*;

import com.userAction.Bo.userBo.UserLoginBo;
import com.userAction.Dao.IDao.IUserLoginDao;
import com.userAction.Dao.UserLoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by ${AbhilashKeerthi} on 1/9/16.
 * we have implemented the UserDetailsService of spring where the UserName is sent into the loadUserByUsername()
 * we have configure AnthenticationService to be called for autentication in
 */
@Service("anthenticationService")
public class AnthenticationService implements UserDetailsService {

    @Autowired
    @Qualifier("authService")
    AuthService authService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {


        UserLoginBo userCreditials = authService.getUserFromUserID(userName);

        // public User(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority > authorities) {

        return new org.springframework.security.core.userdetails.User(
                userCreditials.getUserName(),
                userCreditials.getPassword(),
                userCreditials.getStatus() == 'A',
                true,
                true,
                true,
                this.getUserRole(userCreditials));
    }

    private List<GrantedAuthority> getUserRole(UserLoginBo userCredintials) {

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(userCredintials.getUserRole().getUserRoleName()));
        return authorities;
    }


}



