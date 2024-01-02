package com.projects.cowinportal.service;

import com.projects.cowinportal.dto.BookAppointmentRequestDTO;
import com.projects.cowinportal.dto.BookAppointmentResponseDTO;
import com.projects.cowinportal.models.Appointment;
import com.projects.cowinportal.models.TimeSlot;
import com.projects.cowinportal.models.User;
import com.projects.cowinportal.models.Vaccine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<Vaccine> search();
    public Appointment bookAppointment(User user, TimeSlot timeSlot);
    public boolean cancelAppointment(long referenceNumber);
}
