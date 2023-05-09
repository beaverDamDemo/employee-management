package com.developer.employeemanagement.service.impl;

import com.developer.employeemanagement.entity.OljkeEntity;
import com.developer.employeemanagement.repository.OljkeRepository;
import com.developer.employeemanagement.service.OljkeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OljkeServiceImpl implements OljkeService {

    private final OljkeRepository oljkeRepository;

    public OljkeServiceImpl(OljkeRepository oljkeRepository) {
        this.oljkeRepository = oljkeRepository;
    }

    @Override
    public List<OljkeEntity> findAll() {
        return oljkeRepository.findAll();
    }

    @Override
    public Optional<OljkeEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public OljkeEntity saveOljka(OljkeEntity oljka) {
        return null;
    }

    @Override
    public OljkeEntity updateOljka(OljkeEntity oljka) {
        return null;
    }

    @Override
    public void deleteOljka(Long id) {

    }
}
