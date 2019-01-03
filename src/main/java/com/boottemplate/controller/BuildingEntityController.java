package com.boottemplate.controller;

import com.boottemplate.entity.BuildingEntity;
import com.boottemplate.service.IBuildingEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/building")
public class BuildingEntityController {
    @Autowired
    private IBuildingEntityService buildingEntityService;


    @RequestMapping("/getById")
    public Object getById() {
        BuildingEntity buildingEntity = this.buildingEntityService.selectByPrimaryKey(BigDecimal.valueOf(1));

        return buildingEntity;
    }

    @RequestMapping("/")
    public Object queryBuildingList() {

        return null;
    }

}
