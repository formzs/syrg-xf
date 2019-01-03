package com.boottemplate.service.impl;

import com.boottemplate.entity.BuildingEntity;
import com.boottemplate.mapper.BuildingEntityMapper;
import com.boottemplate.service.IBuildingEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@Transactional(rollbackFor = Exception.class)
public class BuildingEntityServiceImpl implements IBuildingEntityService {
    @Autowired
    private BuildingEntityMapper buildingEntityMapper;

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return buildingEntityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BuildingEntity record) {
        return buildingEntityMapper.insert(record);
    }

    @Override
    public int insertSelective(BuildingEntity record) {
        return buildingEntityMapper.insertSelective(record);
    }

    @Override
    public BuildingEntity selectByPrimaryKey(BigDecimal id) {
        return buildingEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BuildingEntity record) {
        return buildingEntityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BuildingEntity record) {
        return buildingEntityMapper.updateByPrimaryKey(record);
    }
}
