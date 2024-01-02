package com.projects.cowinportal.service;

import com.projects.cowinportal.dto.BookAppointmentRequestDTO;
import com.projects.cowinportal.dto.BookAppointmentResponseDTO;
import com.projects.cowinportal.models.Appointment;
import com.projects.cowinportal.models.TimeSlot;
import com.projects.cowinportal.models.User;

public class UserServiceImpl implements UserService{

    @Override
    public Appointment bookAppointment(User user, TimeSlot timeSlot) {
        return null;
    }

    @Override
    public boolean cancelAppointment(long referenceNumber) {
        return false;
    }
}
