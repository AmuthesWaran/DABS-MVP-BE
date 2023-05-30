package com.zooblesoft.dabsmvp.repository;

import com.zooblesoft.dabsmvp.model.DoctorDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorDetails, String> {

}
