package com.boottemplate.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class BuildingEntity implements Serializable {
    private BigDecimal id;

    private String name;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}