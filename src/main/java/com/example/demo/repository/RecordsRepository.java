package com.example.demo.repository;

import com.example.demo.entity.Records;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface RecordsRepository extends JpaRepository<Records, Long> {

    @Query(
            value = "SELECT count(*) FROM records",
            nativeQuery = true)
    Integer getRecordCount();

    @Query(
            value = "SELECT count(*) FROM lots",
            nativeQuery = true)
    Integer getLotsCount();

}
