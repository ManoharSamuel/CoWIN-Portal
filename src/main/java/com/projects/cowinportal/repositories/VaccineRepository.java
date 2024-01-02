package com.projects.cowinportal.repositories;

import com.projects.cowinportal.models.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepository extends JpaRepository<Vaccine, Long> {}
