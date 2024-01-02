package com.projects.cowinportal.service;

import com.projects.cowinportal.models.TimeSlot;
import org.springframework.stereotype.Service;

@Service
public interface HospitalService {
    public boolean addTimeSlot(TimeSlot timeSlot);
}
