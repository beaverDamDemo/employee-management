package com.developer.employeemanagement.controller;

import com.developer.employeemanagement.dto.request.OljkeRequest;
import com.developer.employeemanagement.dto.response.OljkeResponse;
import com.developer.employeemanagement.entity.OljkeEntity;
import com.developer.employeemanagement.service.OljkeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/{id}")
    public Optional<OljkeEntity> findOljkaById(@PathVariable("id") Long id) {
        return oljkeService.findById(id);
    }
    @PostMapping
    public OljkeEntity newOljka(@RequestBody OljkeEntity oljka) {
        return oljkeService.saveOljka(oljka);
    }
    @PutMapping
    public OljkeEntity updateOljka(@RequestBody OljkeEntity oljka) {
        return oljkeService.updateOljka(oljka);
    }
    @DeleteMapping("/{id}")
    public void deleteOljka(@PathVariable("id") Long id) {
        oljkeService.deleteOljka(id);
    }

    @PostMapping("/res")
    public OljkeResponse shraniOljkeResponse(@RequestBody OljkeRequest oljkaRequest) {
        return oljkeService.saveOljka(oljkaRequest);
    }
    @PutMapping("/res/{id}")
    public OljkeResponse posodobiOljkeResponse(@RequestBody OljkeRequest oljkaRequest, @PathVariable("id") Long id) {
        return oljkeService.updateOljka(oljkaRequest, id);
    }
}
