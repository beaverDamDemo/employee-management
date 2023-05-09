package com.developer.employeemanagement.service.impl;

import com.developer.employeemanagement.dto.mapper.OljkeMapper;
import com.developer.employeemanagement.dto.request.OljkeRequest;
import com.developer.employeemanagement.dto.response.OljkeResponse;
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
        return oljkeRepository.findById(id);
    }

    @Override
    public OljkeEntity saveOljka(OljkeEntity oljka) {
        return oljkeRepository.save(oljka);
    }

    @Override
    public OljkeEntity updateOljka(OljkeEntity oljka) {
        return oljkeRepository.save(oljka);
    }

    @Override
    public void deleteOljka(Long id) {
        oljkeRepository.deleteById(id);
    }

    @Override
    public OljkeResponse saveOljka(OljkeRequest employeeRequest) {
        OljkeEntity employeeEntity = OljkeMapper.MAPPER.fromRequestToENtity(employeeRequest);
        oljkeRepository.save(employeeEntity);
        return OljkeMapper.MAPPER.fromEntityToResponse(employeeEntity);
    }

    @Override
    public OljkeResponse updateOljka(OljkeRequest employeeRequest, Long id) {

        Optional<OljkeEntity> checkExistingEmployee = findById(id);
        if (! checkExistingEmployee.isPresent())
            throw new RuntimeException("Employee Id "+ id + " Not Found!");

        OljkeEntity employeeEntity = OljkeMapper.MAPPER.fromRequestToENtity(employeeRequest);
        employeeEntity.setId(id);
        oljkeRepository.save(employeeEntity);
        return OljkeMapper.MAPPER.fromEntityToResponse(employeeEntity);
    }
}
