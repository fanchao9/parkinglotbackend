package com.example.demo.controller;

import com.example.demo.entity.Records;
import com.example.demo.service.RecordsService;
import org.hibernate.annotations.SQLSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/records")
public class RecordsController {

    @Autowired
    private RecordsService recordsService;

    @GetMapping
    public List<Records> getAllRecords() {
        return recordsService.getAllRecords();
    }

    @GetMapping("/{id}")
    public Records getRecordById(@PathVariable Long id) {
        return recordsService.getRecordById(id);
    }

    @PostMapping("/create")
    public Records createRecord(@RequestBody Records record) {
        return recordsService.saveRecord(record);
    }

    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable Long id) {
        recordsService.deleteRecord(id);
    }

    @GetMapping("/count")
    public int getRecordCount() {return recordsService.getRecordCount();}

    @GetMapping("/lotcount")
    public int getLotsCount() {return recordsService.getLotsCount();}
}
