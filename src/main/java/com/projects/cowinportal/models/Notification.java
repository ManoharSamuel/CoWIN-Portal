package com.projects.cowinportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Notification extends BaseModel{
    @OneToOne
    private Appointment appointment;
    private String message;
}
