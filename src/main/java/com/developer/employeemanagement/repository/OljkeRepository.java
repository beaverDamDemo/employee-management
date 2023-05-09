package com.developer.employeemanagement.repository;

import com.developer.employeemanagement.entity.OljkeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface OljkeRepository extends JpaRepository<OljkeEntity, Long> {
}
