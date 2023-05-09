package com.developer.employeemanagement.service;

import com.developer.employeemanagement.dto.request.OljkeRequest;
import com.developer.employeemanagement.dto.response.OljkeResponse;
import com.developer.employeemanagement.entity.OljkeEntity;

import java.util.List;
import java.util.Optional;

public interface OljkeService {
    List<OljkeEntity> findAll();
    Optional<OljkeEntity> findById(Long id);
    OljkeEntity saveOljka(OljkeEntity oljka);
    OljkeEntity updateOljka(OljkeEntity oljka);
    void deleteOljka(Long id);

    OljkeResponse saveOljka(OljkeRequest oljkaRequest);

    OljkeResponse updateOljka(OljkeRequest oljkaRequest, Long id);
}
