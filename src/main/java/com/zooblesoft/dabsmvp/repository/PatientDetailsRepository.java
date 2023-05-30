package com.zooblesoft.dabsmvp.repository;

import com.zooblesoft.dabsmvp.model.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDetailsRepository extends JpaRepository<PatientDetails, Long> {
}
