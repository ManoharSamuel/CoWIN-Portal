package com.projects.cowinportal.service;

import com.projects.cowinportal.dto.BookAppointmentRequestDTO;
import com.projects.cowinportal.dto.BookAppointmentResponseDTO;
import com.projects.cowinportal.models.Appointment;
import com.projects.cowinportal.models.TimeSlot;
import com.projects.cowinportal.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public Appointment bookAppointment(User user, TimeSlot timeSlot);
    public boolean cancelAppointment(long referenceNumber);
}
