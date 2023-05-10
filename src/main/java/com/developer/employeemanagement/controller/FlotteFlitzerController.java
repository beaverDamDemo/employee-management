package com.developer.employeemanagement.controller;

import com.developer.employeemanagement.entity.FlotteFlitzerEntity;
import com.developer.employeemanagement.service.FlotteFlitzerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flotte-flitzer")
public class FlotteFlitzerController {
    private final FlotteFlitzerService service;

    public FlotteFlitzerController(FlotteFlitzerService service) {
        this.service = service;
    }
    @GetMapping
    public List<FlotteFlitzerEntity> findAll() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Optional<FlotteFlitzerEntity> findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }
    @PostMapping
    public FlotteFlitzerEntity saveNew(@RequestBody FlotteFlitzerEntity f) {
        return service.saveNew(f);
    }
    @PutMapping
    public FlotteFlitzerEntity update(@RequestBody FlotteFlitzerEntity f) {
        return service.update(f);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
