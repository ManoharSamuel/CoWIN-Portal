package com.projects.cowinportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private String name;
    private String email;
    private String phoneNumber;
    private String aadhaarNumber;
    @OneToOne
    private Appointment appointment;
}
