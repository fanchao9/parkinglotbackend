package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


@Entity
public class Lots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int record_id;
    private int lots_id;
    private String plate;
    private String starttime ;
    private String endtime;
    private int status;
    private String notes;

    // Getters and setters
    public int getRecord_id() {
        return record_id;
    }
    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }
    public int getLots_id() {
        return lots_id;
    }
    public void setLots_id(int lots_id) {
        this.lots_id = lots_id;
    }
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public String getStarttime() {
        return starttime;
    }
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    public String getEndtime() {
        return endtime;
    }
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes() {
        this.notes = notes;
    }


}
