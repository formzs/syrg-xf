package com.boottemplate.service.impl;

import com.boottemplate.entity.UserEntity;
import com.boottemplate.mapper.UserEntityMapper;
import com.boottemplate.service.IUserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserEntityServiceImpl implements IUserEntityService {
    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
    public int deleteByPrimaryKey(Short id) {
        return userEntityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserEntity record) {
        return userEntityMapper.insert(record);
    }

    @Override
    public int insertSelective(UserEntity record) {
        return userEntityMapper.insertSelective(record);
    }

    @Override
    public UserEntity selectByPrimaryKey(Short id) {
        return userEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserEntity record) {
        return userEntityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserEntity record) {
        return userEntityMapper.updateByPrimaryKey(record);
    }
}
