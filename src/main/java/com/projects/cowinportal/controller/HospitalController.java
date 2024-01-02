package com.projects.cowinportal.controller;

import com.projects.cowinportal.models.TimeSlot;
import com.projects.cowinportal.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HospitalController {
    private final HospitalService hospitalService;

    @Autowired
    public HospitalController(HospitalService hospitalService){
        this.hospitalService = hospitalService;
    }

    public boolean addTimeSlot(TimeSlot timeSlot) {
        return hospitalService.addTimeSlot(timeSlot);
    }
}
