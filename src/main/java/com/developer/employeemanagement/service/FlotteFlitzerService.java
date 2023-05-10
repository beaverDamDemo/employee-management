package com.developer.employeemanagement.service;

import com.developer.employeemanagement.entity.FlotteFlitzerEntity;

import java.util.List;
import java.util.Optional;

public interface FlotteFlitzerService {
    List<FlotteFlitzerEntity> findAll();
    Optional<FlotteFlitzerEntity> findById(Long id);
    FlotteFlitzerEntity saveNew(FlotteFlitzerEntity f);
    FlotteFlitzerEntity update(FlotteFlitzerEntity f);
    void delete(Long id);
}
