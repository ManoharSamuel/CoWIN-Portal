package com.projects.cowinportal.service;

import com.projects.cowinportal.dto.BookAppointmentRequestDTO;
import com.projects.cowinportal.dto.BookAppointmentResponseDTO;
import com.projects.cowinportal.models.*;
import com.projects.cowinportal.strategies.Availability.SearchType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<Vaccine> searchVaccines(SearchType searchType);
    Appointment bookAppointment(User user, TimeSlot timeSlot);
    boolean cancelAppointment(long referenceNumber);
    Notification initialNotification(Appointment appointment);
    Notification reminderNotification(Appointment appointment);
}
