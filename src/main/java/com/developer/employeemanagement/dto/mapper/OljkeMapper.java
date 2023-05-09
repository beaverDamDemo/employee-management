package com.developer.employeemanagement.dto.mapper;

import com.developer.employeemanagement.dto.request.OljkeRequest;
import com.developer.employeemanagement.dto.response.OljkeResponse;
import com.developer.employeemanagement.entity.OljkeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OljkeMapper {
    OljkeMapper MAPPER = Mappers.getMapper(OljkeMapper.class);
    OljkeEntity fromRequestToENtity(OljkeRequest oljkeRequest);
    OljkeResponse fromEntityToResponse(OljkeEntity oljkeEntity);
}
