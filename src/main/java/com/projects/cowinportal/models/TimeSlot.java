package com.projects.cowinportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class TimeSlot extends BaseModel{
    @ManyToOne
    private Hospital hospital;
    private int noOfVaccines;
    @OneToOne
    private Vaccine vaccine;
    private Date dateTimeOfAppointment;
}
