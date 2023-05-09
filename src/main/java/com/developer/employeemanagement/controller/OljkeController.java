package com.developer.employeemanagement.controller;

import com.developer.employeemanagement.entity.OljkeEntity;
import com.developer.employeemanagement.service.OljkeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oljke")
public class OljkeController {
    private final OljkeService oljkeService;

    public OljkeController(OljkeService oljkeService) {
        this.oljkeService = oljkeService;
    }

    @GetMapping
    public List<OljkeEntity> findAll() {
        return oljkeService.findAll();
    }
}
