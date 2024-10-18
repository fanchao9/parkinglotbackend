package com.example.demo.service;

import com.example.demo.entity.Records;
import com.example.demo.repository.RecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordsService {

    @Autowired
    private RecordsRepository recordsRepository;

    public List<Records> getAllRecords() {
        return recordsRepository.findAll();
    }

    public Records getRecordById(Long id) {
        return recordsRepository.findById(id).orElse(null);
    }

    public Records saveRecord(Records record) {
        return recordsRepository.save(record);
    }

    public void deleteRecord(Long id) {
        recordsRepository.deleteById(id);
    }

    public int getRecordCount() { return recordsRepository.getRecordCount();}

    public int getLotsCount() { return recordsRepository.getLotsCount();}

}
