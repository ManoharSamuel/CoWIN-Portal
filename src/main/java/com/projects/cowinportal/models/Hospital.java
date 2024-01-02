package com.projects.cowinportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Hospital extends BaseModel{
    private String name;
    private String address;
    @OneToMany
    private List<Vaccine> vaccineList;
    @OneToMany
    private List<TimeSlot> timeSlots;
}
