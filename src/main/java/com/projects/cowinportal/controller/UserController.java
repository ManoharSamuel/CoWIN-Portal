package com.projects.cowinportal.controller;

import com.projects.cowinportal.dto.BookAppointmentRequestDTO;
import com.projects.cowinportal.dto.BookAppointmentResponseDTO;
import com.projects.cowinportal.models.Appointment;
import com.projects.cowinportal.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public BookAppointmentResponseDTO bookAppointment(BookAppointmentRequestDTO bookAppointmentRequestDTO) {
        BookAppointmentResponseDTO bookAppointmentResponseDTO = new BookAppointmentResponseDTO();
        Appointment appointment = userService.bookAppointment(bookAppointmentRequestDTO.getUser(), bookAppointmentRequestDTO.getTimeSlot());
        bookAppointmentResponseDTO.setAppointment(appointment);
        return bookAppointmentResponseDTO;
    }

    public boolean cancelAppointment(long referenceNumber) {
        return userService.cancelAppointment(referenceNumber);
    }
}
