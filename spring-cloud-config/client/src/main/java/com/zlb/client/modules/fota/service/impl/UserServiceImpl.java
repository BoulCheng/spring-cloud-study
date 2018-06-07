package com.zlb.client.modules.fota.service.impl;


import com.zlb.client.modules.fota.domain.BUser;
import com.zlb.client.modules.fota.mapper.BUserMapper;
import com.zlb.client.modules.fota.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BUserMapper bUserMapper;

    @Override
    public List<BUser> listAllBUser(){
        return bUserMapper.listAllBUser();
    }
}
