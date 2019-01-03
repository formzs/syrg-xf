package com.boottemplate.mapper;

import com.boottemplate.entity.BuildingEntity;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

@Mapper
public interface BuildingEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BuildingEntity record);

    int insertSelective(BuildingEntity record);

    BuildingEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BuildingEntity record);

    int updateByPrimaryKey(BuildingEntity record);
}