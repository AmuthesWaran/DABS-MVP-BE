package com.zooblesoft.dabsmvp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "doctor_details")
public class DoctorDetails {

    @Id
    private String doctorID;
    private String doctorName;
    private String specialization;
    private  String available_slots;
    private String password;
    private Long phone_number;

}
