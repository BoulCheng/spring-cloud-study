package com.zlb.client.modules.platform.mapper;


import com.zlb.client.modules.fota.domain.BUser;

import java.util.List;

public interface BUserMapper2 {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(BUser record);

    BUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BUser record);

    /**
     * 查询所有用户
     * @return
     */
    List<BUser> listAllBUser();
}