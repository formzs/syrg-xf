package com.boottemplate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by Mr.ma on 2019/1/2.
 */
@RestController
@RequestMapping("/hello")
public class Test {
    private Logger logger = LoggerFactory.getLogger(Test.class);
    @Autowired
    private BuildingRepository buildingRepository;




    /**查询所有女生列表*/
    @RequestMapping("/buildings")
    public List<Building> buildings(){
        return buildingRepository.findAll();
    }

    @RequestMapping("/hello")
    public @ResponseBody
    String HelloWorld(){
        for(int i=0;i<1000;i++){
            logger.debug("debug"+i);
            logger.info("info"+i);
            logger.warn("warn"+i);
            logger.error("error"+i);
        }
        return "Hello World!";
    }

}
