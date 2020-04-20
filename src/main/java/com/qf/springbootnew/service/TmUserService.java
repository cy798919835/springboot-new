package com.qf.springbootnew.service;

import com.qf.springbootnew.entity.TUser;

import java.util.List;

public interface TmUserService {
    public TUser findUser(Integer id);
    public List<TUser> findUserList();
}
