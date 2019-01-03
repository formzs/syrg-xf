package com.boottemplate.mapper;

import com.boottemplate.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserEntityMapper {
    int deleteByPrimaryKey(Short id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}