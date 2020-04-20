package com.qf.springbootnew.service.impl;

import com.qf.springbootnew.entity.TUser;
import com.qf.springbootnew.mapper.TUserMapper;
import com.qf.springbootnew.service.TmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TmUserServiceImpl implements TmUserService{

    @Autowired
    private TUserMapper tUserMapper;
    @Override
    public TUser findUser(Integer id) {
        return tUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TUser> findUserList() {
        return tUserMapper.findUserList();
    }
}
