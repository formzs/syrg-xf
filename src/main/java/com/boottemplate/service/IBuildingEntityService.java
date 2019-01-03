package com.boottemplate.service;

import com.boottemplate.entity.BuildingEntity;

import java.math.BigDecimal;

public interface IBuildingEntityService {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BuildingEntity record);

    int insertSelective(BuildingEntity record);

    BuildingEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BuildingEntity record);

    int updateByPrimaryKey(BuildingEntity record);
}
