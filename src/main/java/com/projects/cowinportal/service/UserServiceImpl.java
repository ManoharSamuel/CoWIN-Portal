package com.projects.cowinportal.service;

import com.projects.cowinportal.dto.BookAppointmentRequestDTO;
import com.projects.cowinportal.dto.BookAppointmentResponseDTO;
import com.projects.cowinportal.models.Appointment;
import com.projects.cowinportal.models.TimeSlot;
import com.projects.cowinportal.models.User;
import com.projects.cowinportal.models.Vaccine;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Override
    public List<Vaccine> search() {
        return null;
    }

    @Override
    public Appointment bookAppointment(User user, TimeSlot timeSlot) {
        return null;
    }

    @Override
    public boolean cancelAppointment(long referenceNumber) {
        return false;
    }
}
