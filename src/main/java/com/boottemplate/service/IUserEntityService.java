package com.boottemplate.service;

import com.boottemplate.entity.UserEntity;

public interface IUserEntityService {
    int deleteByPrimaryKey(Short id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}
