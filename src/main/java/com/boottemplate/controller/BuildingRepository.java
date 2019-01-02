package com.boottemplate.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Mr.ma on 2019/1/2.
 */
@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {
    public Optional<Building> findById(Long id);
}
