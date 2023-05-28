package com.zooblesoft.dabsmvp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "patient_details")
public class PatientDetails {

    @Id
    private Long phoneNo;
    private String fullName;
    private String city;
    private String gender;
    private DateTimeFormat dateOfBirth;
    private String email;

}
