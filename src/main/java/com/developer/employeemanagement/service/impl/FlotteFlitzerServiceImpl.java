package com.developer.employeemanagement.service.impl;

import com.developer.employeemanagement.entity.FlotteFlitzerEntity;
import com.developer.employeemanagement.repository.FlotteFlitzerRepository;
import com.developer.employeemanagement.service.FlotteFlitzerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlotteFlitzerServiceImpl implements FlotteFlitzerService {
    private final FlotteFlitzerRepository repo;

    public FlotteFlitzerServiceImpl(FlotteFlitzerRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<FlotteFlitzerEntity> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<FlotteFlitzerEntity> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public FlotteFlitzerEntity saveNew(FlotteFlitzerEntity f) {
        return repo.save(f);
    }

    @Override
    public FlotteFlitzerEntity update(FlotteFlitzerEntity f) {
        return repo.save(f);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
