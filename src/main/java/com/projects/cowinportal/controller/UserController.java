package com.projects.cowinportal.controller;

import com.projects.cowinportal.dto.BookAppointmentRequestDTO;
import com.projects.cowinportal.dto.BookAppointmentResponseDTO;
import com.projects.cowinportal.dto.SignUpRequestDTO;
import com.projects.cowinportal.dto.SignUpResponseDTO;
import com.projects.cowinportal.models.Appointment;
import com.projects.cowinportal.models.Vaccine;
import com.projects.cowinportal.service.UserService;
import com.projects.cowinportal.strategies.Availability.SearchType;
import com.projects.cowinportal.strategies.UserLogin.LoginType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDTO signUp(SignUpRequestDTO signUpRequestDTO) {
        SignUpResponseDTO signUpResponseDTO = new SignUpResponseDTO();
        userService.signUp(signUpRequestDTO.getName(), signUpRequestDTO.getEmail(), signUpRequestDTO.getPhoneNumber(),
                            signUpRequestDTO.getAadhaarNumber());
        signUpResponseDTO.setResponseCode("200");
        signUpResponseDTO.setResponseMessage("Sign up is successful");
        return signUpResponseDTO;
    }

    public boolean login(LoginType loginType, String loginId, String otp) {
        return userService.login(loginType, loginId, otp);
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

    public List<Vaccine> searchVaccines(SearchType searchType) {
        return userService.searchVaccines(searchType);
    }
}
